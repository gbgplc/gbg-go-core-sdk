# Instances

## Overview

### Available Operations

* [handoffToken](#handofftoken) - Mint a fresh position-scoped handoff token
* [delete](#delete) - Delete journey state

## handoffToken

Mints a fresh page-mode delivery-token + connect-secret pair pointing at the same instance, stamped devicePosition=joined, so a second device can join. Device-token only, and only from the device that started the journey; customer tokens and already-joined devices are rejected with 403. Returns { instanceUrl, devicePosition, expiresIn }.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createHandoffToken" method="post" path="/v2/captain/journey/instance/{instanceId}/handoff-token" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.instances.handoffToken({
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "<id>",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { instancesHandoffToken } from "@gbg/go-core/funcs/instances-handoff-token.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await instancesHandoffToken(go, {
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "<id>",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("instancesHandoffToken failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateHandoffTokenRequest](../../models/operations/create-handoff-token-request.md)                                                                                | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [operations.CreateHandoffTokenSecurity](../../models/operations/create-handoff-token-security.md)                                                                              | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.HandoffTokenResponse](../../models/handoff-token-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## delete

Permanently deletes a completed journey instance (REQ-02-002).

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteInstance" method="post" path="/v2/captain/journey/state/delete" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.instances.delete();

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { instancesDelete } from "@gbg/go-core/funcs/instances-delete.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await instancesDelete(go);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("instancesDelete failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteInstanceRequest](../../models/operations/delete-instance-request.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.DeleteResponse](../../models/delete-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 404         | application/json      |
| errors.ErrorResponse  | 500                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |