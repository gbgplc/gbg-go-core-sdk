# Changelog

Notable changes to the GBG GO Core SDK, for both the TypeScript (`@gbg/go-core`)
and Java (`com.gbg:go-core-sdk`) packages. They are generated from one spec and
version together.

`RELEASES.md` is a generator-written log of every build. This file is the
human-readable one: what changed, what breaks, and what to do about it.

## 0.2.0-alpha (TypeScript `0.2.0-alpha.0`, Java `0.2.0-alpha01`)

Previous release: TypeScript `0.1.3`, Java `0.1.0-alpha01`.

This is a large, breaking release. The SDK is now generated from the OpenAPI
spec Captain serves live at `/v2/captain/openapi.json`, rather than from a spec
committed to this repository and maintained by hand.

That swap is the reason for almost everything below. The live spec tracks the
server, so the SDK stops silently disagreeing with it. It is also thinner than
the hand-written spec it replaced, so some things that used to be typed are now
plain maps.

### Fixed

- **Journey state no longer drops the journey result.** In 0.1.x the generated
  state response omitted `result` and `context.process`, so per-module results,
  timings, the journey summary and the decision never reached calling code.
  Consumers were working around this by capturing the raw HTTP response and
  re-parsing it. `context` and `result` are now carried through as maps, and
  that workaround can be deleted.

- **Interaction fetch now returns `result`.** The decision is available from the
  fetch response, without a separate state call.

### Breaking

#### 1. The base URL no longer includes `/v2/captain`

`/v2/captain` moved out of the server list and into each operation path.

If you pass the base URL documented in the developer guide
(`https://eu.platform.go.gbgplc.com/v2/captain`) to `serverURL()`, every request
now goes to `/v2/captain/v2/captain/...`. Go answers that with
`401 Authentication required`, which is misleading: the credentials are fine,
the path is wrong.

Pass the host only.

```ts
// before
new Go({ serverURL: "https://eu.platform.go.gbgplc.com/v2/captain" })
// after
new Go({ serverURL: "https://eu.platform.go.gbgplc.com" })
```

```java
// before
Go.builder().serverURL("https://eu.platform.go.gbgplc.com/v2/captain")
// after
Go.builder().serverURL("https://eu.platform.go.gbgplc.com")
```

Better still, drop `serverURL` and use the built-in server list, which now
carries all three regions (EU index 0, US 1, AU 2).

#### 2. Java: catching `APIException` no longer catches API errors

A new `ErrorResponse` type carries the modelled error statuses (400, 401, 403,
404, 409, 429, 500, 503 depending on the operation). It extends `GoException`,
**not** `APIException`.

So existing code like this silently stops handling normal errors, including
expired-token retries:

```java
try { ... } catch (APIException e) { ... }   // misses every modelled error
```

Catch the shared parent instead:

```java
try { ... } catch (GoException e) { ... }    // catches ErrorResponse and APIException
```

#### 3. Many generated types were removed or renamed

The Java model set went from 523 to 434 classes, with substantial churn in both
directions. The ones most likely to be in your imports:

| 0.1.x | 0.2.0 |
| --- | --- |
| `ResponseBody1` / `ResponseBody2`, `FetchInteractionError`, `Collect*` | one `InteractionFetchResponse` |
| `SubmitInteractionError`, `SubmitInteractionResponseBody` | `InteractionSubmitResponse` (status only) |
| `GetJourneyStateStatus`, `Journey1`, `Journey2`, `JourneyStatus1/2` | plain strings |
| `FetchInteractionClassification`, `GetJourneyStateClassification` | read from the untyped `context` map |
| `FetchInteractionContext`, `GetJourneyStateContext` and their trees | `Map<String, Object>` |

TypeScript equivalents changed in the same shape.

The practical consequence: `interaction`, `context` and `result` are now untyped
maps. Read them as maps, the way the Go API already returns them. Do not
reintroduce a hand-maintained parallel type for them, because keeping one in
sync with the server is the bug this release exists to fix.

#### 4. `interactions.fetch` and `interactions.submit` take a per-call token

These two operations accept either a customer token or an end-user interaction
token, so the generator gives them their own security argument rather than
taking the client-level one.

The client-level token (`customerAccess`) is **not** used for these two calls.
If you do not pass a token per call, the request goes out with no
`Authorization` header and nothing warns you.

```ts
const sdk = new Go({ customerAccess: "..." });   // used by journeys.*, not by these

await sdk.interactions.fetch(
  { interactionAccess: endUserToken },               // required, per call
  { body: { instanceId } },
);
```

```java
sdk.interactions().fetch(
    FetchInteractionSecurity.builder().interactionAccess(endUserToken).build(),
    null,          // view
    body);
```

Set `interactionAccess` for an end-user token, `customerAccess` for a customer
token. Set one, not both.

In TypeScript the per-call argument accepts a token **string only**. The
client-level `customerAccess` accepts `string | (() => Promise<string>)`, so if
you rely on a function to supply a fresh token, you will need to resolve it
yourself before each `fetch`/`submit` call.

#### 5. Java: argument order is not consistent across operations

```java
interactions().fetch(security, view, body);
interactions().submit(request, security);   // security last here
journeys().getState(view, body);
```

Use the builder form (`fetch()`, `submit()`, …) if you would rather not depend
on positional order. TypeScript is consistent: security first where present.

#### 6. `journeys.start` accepts only HTTP 201

0.1.x also accepted 200. Live Go returns 201, so this is not a problem today,
but a 200 from that endpoint would now throw.

#### 7. There is no way to prefill a journey

`StartJourneyRequest` no longer has the untyped `data` field it carried in
0.1.x, and `StartJourneySubject` silently drops properties it does not declare.
The live spec declares only `resourceId`, `context` and `scenario` on the start
request.

If you depend on prefill, stay on 0.1.x for now and track the Captain-side fix.

### Added

- **A slim response view.** `?view=slim` on interaction fetch and journey state
  returns a compact, fully typed shape (`SlimInteractionFetchResponse`,
  `SlimStateFetchResponse`) instead of the full response.

  It is not a drop-in replacement for the full view. `SlimStep` carries
  `nodeId`, `name`, `outcome` and `outcomeClassification` but no status and no
  timing, so anything reading per-module status or `durationMilliSec` needs the
  full view.

### Known gaps

These are real and known. Most need a fix in the Captain spec; they are tracked
and are not worked around here, because patching response shapes by hand is what
caused the 0.1.x data loss.

- **Full and slim fetch responses cannot be told apart reliably.** The spec
  declares the 200 as an untagged union of the two shapes, so the generated
  client picks between them by counting matched fields. It picks wrong in both
  directions: a full-view response with no `context` is read as slim, and a
  genuine slim response is read as full. In Java this shows up as
  `interactionFetchResponse()` or `slimInteractionFetchResponse()` being empty.
  Handle both variants on every call until the spec is fixed.

- **403 and 422 are not modelled.** They are not declared in the spec for fetch
  and submit, so they arrive as `GoDefaultError` (TypeScript) or `APIException`
  (Java) rather than `ErrorResponse`.

- **Token endpoint errors are not modelled.** Every failure from
  `tokens.generate` surfaces as an untyped default error with no code or message.

- **`InteractionSubmitResponse.status` only defines `success`,** and
  `outstandingGroups[].cardinality` only defines `at-least-one`. In TypeScript
  these are closed enums: if the server ever sends a new value, the **entire
  response** fails to parse, not just that field. Java treats them as open.

- **Errors returned inside a 200 response are no longer modelled.** Real
  rejections arrive as HTTP errors, which the SDK does handle.

- **The full fetch variant is less typed than the slim one.** `outstanding` and
  `instructions` are `Object` in the full shape and `List<String>` in slim.

- **Java: `JSON.getMapper()` needs jackson-databind on your own classpath** in
  0.2.0-alpha01. Fixed from the next build; until then add
  `com.fasterxml.jackson.core:jackson-databind` to your build if you call it.

### Security note

The debug logger prints every request header, including
`Authorization: Bearer …`, and full request bodies, which for interaction
submits includes base64-encoded document and selfie images.

It is off by default. Do not set `GO_DEBUG` or pass a `debugLogger` in
production, and do not ship debug logs to a shared log sink.
