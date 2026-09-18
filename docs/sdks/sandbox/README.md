# Sandbox

## Overview

### Available Operations

* [createScenario](#createscenario) - Create a sandbox scenario on a journey
* [listScenarios](#listscenarios) - List a journey's sandbox scenarios
* [getScenario](#getscenario) - Read a sandbox scenario
* [putScenario](#putscenario) - Replace a sandbox scenario
* [deleteScenario](#deletescenario) - Delete a sandbox scenario

## createScenario

Creates an org-tier sandbox scenario belonging to the journey in the path. Returns 409 if the name is taken on that journey (the same name may exist on other journeys). The scenario is resolvable at journey-start, for runs of that journey only, via the x-gbg-scenario header. Org is taken from the token.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createSandboxScenario" method="post" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.sandbox.createScenario({
    journeyId: "onboarding-journey",
    body: {
      name: "my-scenario",
      data: {},
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
import { sandboxCreateScenario } from "@gbg/go-core/funcs/sandbox-create-scenario.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await sandboxCreateScenario(go, {
    journeyId: "onboarding-journey",
    body: {
      name: "my-scenario",
      data: {},
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("sandboxCreateScenario failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateSandboxScenarioRequest](../../models/operations/create-sandbox-scenario-request.md)                                                                          | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.SandboxScenarioWritten](../../models/sandbox-scenario-written.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 409    | application/json      |
| errors.ErrorResponse  | 503                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## listScenarios

Lists the org's sandbox scenarios belonging to the journey in the path — never another journey's. Pass includePlatform=true to also return read-only GBG-provided platform scenarios (available on every journey); an org scenario shadows a platform scenario of the same name.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listSandboxScenarios" method="get" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.sandbox.listScenarios({
    journeyId: "onboarding-journey",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { sandboxListScenarios } from "@gbg/go-core/funcs/sandbox-list-scenarios.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await sandboxListScenarios(go, {
    journeyId: "onboarding-journey",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("sandboxListScenarios failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListSandboxScenariosRequest](../../models/operations/list-sandbox-scenarios-request.md)                                                                            | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.SandboxScenarioSummary[]](../../models/.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403         | application/json      |
| errors.ErrorResponse  | 503                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## getScenario

Reads one org-tier sandbox scenario of the journey in the path. By default does not fall back to the platform tier or to another journey, so a name that exists only at platform level, or only on another journey, returns 404. Pass includePlatform=true to fall back to the read-only GBG-provided scenario of that name; the response `tier` says which tier served it. Another journey is never consulted either way.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getSandboxScenario" method="get" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.sandbox.getScenario({
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { sandboxGetScenario } from "@gbg/go-core/funcs/sandbox-get-scenario.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await sandboxGetScenario(go, {
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("sandboxGetScenario failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetSandboxScenarioRequest](../../models/operations/get-sandbox-scenario-request.md)                                                                                | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.SandboxScenario](../../models/sandbox-scenario.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 503                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## putScenario

Replaces an existing org-tier sandbox scenario of the journey in the path. Returns 404 if it does not exist on that journey — use POST to create. Requires UPDATE:journey; creating (POST) requires CREATE:journey, so an edit-only grant cannot mint new scenarios through this endpoint.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="putSandboxScenario" method="put" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.sandbox.putScenario({
    journeyId: "onboarding-journey",
    name: "my-scenario",
    body: {
      data: {},
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
import { sandboxPutScenario } from "@gbg/go-core/funcs/sandbox-put-scenario.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await sandboxPutScenario(go, {
    journeyId: "onboarding-journey",
    name: "my-scenario",
    body: {
      data: {},
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("sandboxPutScenario failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PutSandboxScenarioRequest](../../models/operations/put-sandbox-scenario-request.md)                                                                                | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.SandboxScenarioWritten](../../models/sandbox-scenario-written.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 503                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## deleteScenario

Deletes an org-tier sandbox scenario of the journey in the path by archiving it: it disappears from listings and journey-start resolution, but its version history is retained and creating the same name again restores it. A platform scenario of the same name, previously shadowed by this one on this journey, becomes resolvable again at journey-start.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteSandboxScenario" method="delete" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  await go.sandbox.deleteScenario({
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { sandboxDeleteScenario } from "@gbg/go-core/funcs/sandbox-delete-scenario.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await sandboxDeleteScenario(go, {
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("sandboxDeleteScenario failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteSandboxScenarioRequest](../../models/operations/delete-sandbox-scenario-request.md)                                                                          | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 503                   | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |