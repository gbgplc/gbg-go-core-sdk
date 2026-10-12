# Journeys

## Overview

### Available Operations

* [start](#start) - Start a new journey
* [getState](#getstate) - Fetch journey state
* [getSchemas](#getschemas) - Fetch interaction JSON schemas
* [terminate](#terminate) - Terminate journey

## start

Creates a new journey instance from a resource definition.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="startJourney" method="post" path="/v2/captain/journey/start" example="Default" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.start();

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { journeysStart } from "@gbg/go-core/funcs/journeys-start.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysStart(go);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("journeysStart failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.StartJourneyRequest](../../models/operations/start-journey-request.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.JourneyStartResponse](../../models/journey-start-response.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.ErrorResponse    | 500, 503                | application/json        |
| errors.GoDefaultError   | 4XX, 5XX                | \*/\*                   |

## getState

Retrieves the current state of a journey instance.

### Example Usage: Completed

<!-- UsageSnippet language="typescript" operationID="getJourneyState" method="post" path="/v2/captain/journey/state/fetch" example="Completed" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.getState({
    view: "slim",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { journeysGetState } from "@gbg/go-core/funcs/journeys-get-state.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysGetState(go, {
    view: "slim",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("journeysGetState failed:", res.error);
  }
}

run();
```
### Example Usage: InProgress

<!-- UsageSnippet language="typescript" operationID="getJourneyState" method="post" path="/v2/captain/journey/state/fetch" example="InProgress" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.getState({
    view: "slim",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { journeysGetState } from "@gbg/go-core/funcs/journeys-get-state.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysGetState(go, {
    view: "slim",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("journeysGetState failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetJourneyStateRequest](../../models/operations/get-journey-state-request.md)                                                                                      | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetJourneyStateResponse](../../models/operations/get-journey-state-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 404         | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## getSchemas

Retrieves design-time JSON schemas for the interactions in a delivery — what information the journey
expects a user to complete, which fields are required, and what shape they take.

Identifiers are short on both sides; this endpoint never accepts or returns a GRN.
`resourceId` is the same short identifier `POST /journey/start` takes (`my-delivery@latest`), and the
organization is derived from your token. The response reports the short `deliveryId` plus
`resolvedVersion`, the concrete revision it resolved — join them as `<deliveryId>@<resolvedVersion>` to
pin `/journey/start` to exactly the revision these schemas describe (`@latest` is an alias, not a
snapshot).

Two caveats on that pin. `/journey/start` serves from a cache, so it can briefly run a revision behind
the one described here. And the pin is only startable when the delivery lives in your token's primary
organization: this endpoint also searches organizations granted by the token's `x_orgs` federation
claim, which `/journey/start` does not, so a delivery found only through federation is readable here
but not startable with the same token.

Known limitation on that federated search: a delivery that a parent organization *linked* into yours
is not currently followed to its source and reports 404 here, even though `/journey/start` can run it.

Filters by `interactionId` and/or `instruction` are optional; `instruction` requires `interactionId`.
`interactionId` is the short interaction id (e.g. `segment1`) — a GRN, or a short id carrying an
`@version` suffix, is rejected with 400.

Note: the `interactionId` reported here is a design-time label for reading the journey. It is not the
identifier `POST /journey/interaction/submit` expects — that one comes from
`POST /journey/interaction/fetch`, which uses the runtime's own identifiers.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getJourneySchemas" method="post" path="/v2/captain/journey/schema/fetch" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.getSchemas();

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { journeysGetSchemas } from "@gbg/go-core/funcs/journeys-get-schemas.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysGetSchemas(go);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("journeysGetSchemas failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetJourneySchemasRequest](../../models/operations/get-journey-schemas-request.md)                                                                                  | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.SchemaFetchResponse](../../models/schema-fetch-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 404, 422    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## terminate

Terminates an active journey instance.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="terminateJourney" method="post" path="/v2/captain/journey/terminate" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.terminate();

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { journeysTerminate } from "@gbg/go-core/funcs/journeys-terminate.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysTerminate(go);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("journeysTerminate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.TerminateJourneyRequest](../../models/operations/terminate-journey-request.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.TerminateResponse](../../models/terminate-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 404, 409    | application/json      |
| errors.ErrorResponse  | 500                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |