# Interactions

## Overview

### Available Operations

* [fetch](#fetch) - Fetch current interaction
* [submit](#submit) - Submit interaction data
* [uploadAsset](#uploadasset) - Stream an interaction asset to storage

## fetch

Retrieves the current interaction state for a journey instance.

### Example Usage: error

<!-- UsageSnippet language="typescript" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="error" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.fetch({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
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
import { interactionsFetch } from "@gbg/go-core/funcs/interactions-fetch.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsFetch(go, {
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
    view: "slim",
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
### Example Usage: processing

<!-- UsageSnippet language="typescript" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="processing" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.fetch({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
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
import { interactionsFetch } from "@gbg/go-core/funcs/interactions-fetch.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsFetch(go, {
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
    view: "slim",
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
### Example Usage: success

<!-- UsageSnippet language="typescript" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="success" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.fetch({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
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
import { interactionsFetch } from "@gbg/go-core/funcs/interactions-fetch.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsFetch(go, {
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  }, {
    view: "slim",
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
| errors.ErrorResponse  | 400, 401, 404         | application/json      |
| errors.ErrorResponse  | 500                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## submit

Submits participant data for an interaction.

### Example Usage: error

<!-- UsageSnippet language="typescript" operationID="submitInteraction" method="post" path="/v2/captain/journey/interaction/submit" example="error" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.submit({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
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
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
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
### Example Usage: success

<!-- UsageSnippet language="typescript" operationID="submitInteraction" method="post" path="/v2/captain/journey/interaction/submit" example="success" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.submit({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
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
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
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

**Promise\<[models.InteractionSubmitResponse](../../models/interaction-submit-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 409, 429    | application/json      |
| errors.ErrorResponse  | 500                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## uploadAsset

Streams a raw asset body (application/octet-stream) to storage and returns its gofs key. Identifiers are passed as X-Instance-Id, X-Interaction-Id and X-Domain-Element-Id headers. Accepts capture elements: the encrypted selfie (EncryptedSelfie/selfieImage), the plain selfie (Selfie/selfieImage), and both document sides (PrimaryDocument/side1Image, PrimaryDocument/side2Image). An element the current deployment does not accept returns 422 — submit that asset inline (base64) in the interaction submit instead.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="uploadInteractionAsset" method="post" path="/v2/captain/journey/interaction/asset/upload" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.interactions.uploadAsset({
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { interactionsUploadAsset } from "@gbg/go-core/funcs/interactions-upload-asset.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await interactionsUploadAsset(go, {
    customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("interactionsUploadAsset failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                                                     | [operations.UploadInteractionAssetSecurity](../../models/operations/upload-interaction-asset-security.md)                                                                      | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.UploadInteractionAssetResponse](../../models/operations/upload-interaction-asset-response.md)\>**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| errors.ErrorResponse         | 400, 401, 403, 409, 422, 429 | application/json             |
| errors.ErrorResponse         | 500, 503                     | application/json             |
| errors.GoDefaultError        | 4XX, 5XX                     | \*/\*                        |