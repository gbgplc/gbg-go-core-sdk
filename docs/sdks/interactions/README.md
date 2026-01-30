# Interactions

## Overview

### Available Operations

* [submit](#submit) - Submit Interaction
* [fetch](#fetch) - Fetch Interaction

## submit

Submit Interaction

### Example Usage

<!-- UsageSnippet language="typescript" operationID="submitInteraction" method="post" path="/journey/interaction/submit" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.submit({
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "PiKR2O0IjyUR8KV3RviKt4we",
    interactionId: "int-456",
    participants: [
      {
        domainElementId: "foo",
        instruction: "open",
      },
    ],
    context: {
      subject: {
        uid: "customer-789",
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { interactionsSubmit } from "@gbg/go-core/funcs/interactions-submit.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsSubmit(go, {
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "PiKR2O0IjyUR8KV3RviKt4we",
    interactionId: "int-456",
    participants: [
      {
        domainElementId: "foo",
        instruction: "open",
      },
    ],
    context: {
      subject: {
        uid: "customer-789",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("interactionsSubmit failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.SubmitInteractionRequest](../../models/operations/submit-interaction-request.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [operations.SubmitInteractionSecurity](../../models/operations/submit-interaction-security.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.SubmitInteractionResponse](../../models/operations/submit-interaction-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## fetch

Fetch Interaction

### Example Usage

<!-- UsageSnippet language="typescript" operationID="fetchInteraction" method="post" path="/journey/interaction/fetch" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.fetch({
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "PiKR2O0IjyUR8KV3RviKt4we",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { interactionsFetch } from "@gbg/go-core/funcs/interactions-fetch.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsFetch(go, {
    interactionAccess: process.env["GO_INTERACTION_ACCESS"] ?? "",
  }, {
    instanceId: "PiKR2O0IjyUR8KV3RviKt4we",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("interactionsFetch failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.FetchInteractionRequest](../../models/operations/fetch-interaction-request.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [operations.FetchInteractionSecurity](../../models/operations/fetch-interaction-security.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.FetchInteractionResponse](../../models/operations/fetch-interaction-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |