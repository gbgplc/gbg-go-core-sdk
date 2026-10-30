# TestScenarios

## Overview

### Available Operations

* [create](#create) - Create a test scenario on a journey
* [list](#list) - List a journey's test scenarios
* [get](#get) - Read a test scenario
* [put](#put) - Replace a test scenario
* [delete](#delete) - Delete a test scenario

## create

Creates an org-tier test scenario belonging to the journey in the path. Returns 409 if the name is taken on that journey (the same name may exist on other journeys). The scenario is resolvable at journey-start, for runs of that journey only, via the x-gbg-scenario header. Org is taken from the token.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createTestScenario" method="post" path="/test/journeys/{journeyId}/scenarios" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.testScenarios.create({
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
import { testScenariosCreate } from "@gbg/go-core/funcs/test-scenarios-create.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await testScenariosCreate(go, {
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
    console.log("testScenariosCreate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateTestScenarioRequest](../../models/operations/create-test-scenario-request.md)                                                                                | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.TestScenarioWritten](../../models/test-scenario-written.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 409    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## list

Lists the org's test scenarios belonging to the journey in the path — never another journey's. Pass includePlatform=true to also return read-only GBG-provided platform scenarios (available on every journey); an org scenario shadows a platform scenario of the same name.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listTestScenarios" method="get" path="/test/journeys/{journeyId}/scenarios" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.testScenarios.list({
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
import { testScenariosList } from "@gbg/go-core/funcs/test-scenarios-list.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await testScenariosList(go, {
    journeyId: "onboarding-journey",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("testScenariosList failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListTestScenariosRequest](../../models/operations/list-test-scenarios-request.md)                                                                                  | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.TestScenarioSummary[]](../../models/.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403         | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## get

Reads one org-tier test scenario of the journey in the path. By default does not fall back to the platform tier or to another journey, so a name that exists only at platform level, or only on another journey, returns 404. Pass includePlatform=true to fall back to the read-only GBG-provided scenario of that name; the response `tier` says which tier served it. Another journey is never consulted either way.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getTestScenario" method="get" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.testScenarios.get({
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
import { testScenariosGet } from "@gbg/go-core/funcs/test-scenarios-get.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await testScenariosGet(go, {
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("testScenariosGet failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetTestScenarioRequest](../../models/operations/get-test-scenario-request.md)                                                                                      | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.TestScenario](../../models/test-scenario.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## put

Replaces an existing org-tier test scenario of the journey in the path. Returns 404 if it does not exist on that journey — use POST to create. Requires UPDATE:journey; creating (POST) requires CREATE:journey, so an edit-only grant cannot mint new scenarios through this endpoint.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="putTestScenario" method="put" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.testScenarios.put({
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
import { testScenariosPut } from "@gbg/go-core/funcs/test-scenarios-put.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await testScenariosPut(go, {
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
    console.log("testScenariosPut failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PutTestScenarioRequest](../../models/operations/put-test-scenario-request.md)                                                                                      | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[models.TestScenarioWritten](../../models/test-scenario-written.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## delete

Deletes an org-tier test scenario of the journey in the path by archiving it: it disappears from listings and journey-start resolution, but its version history is retained and creating the same name again restores it. A platform scenario of the same name, previously shadowed by this one on this journey, becomes resolvable again at journey-start.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteTestScenario" method="delete" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  await go.testScenarios.delete({
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
import { testScenariosDelete } from "@gbg/go-core/funcs/test-scenarios-delete.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await testScenariosDelete(go, {
    journeyId: "onboarding-journey",
    name: "my-scenario",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("testScenariosDelete failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteTestScenarioRequest](../../models/operations/delete-test-scenario-request.md)                                                                                | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse  | 400, 401, 403, 404    | application/json      |
| errors.ErrorResponse  | 500, 503              | application/json      |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |