# Journeys

## Overview

### Available Operations

* [start](#start) - Start Journey
* [getState](#getstate) - Get State Data

## start

Start Journey

### Example Usage

<!-- UsageSnippet language="typescript" operationID="startJourney" method="post" path="/journey/start" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.start({
    resourceId: "a4c68509c24789888eb466@latest",
    context: {
      subject: {
        identity: {},
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
import { journeysStart } from "@gbg/go-core/funcs/journeys-start.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const res = await journeysStart(go, {
    resourceId: "a4c68509c24789888eb466@latest",
    context: {
      subject: {
        identity: {},
      },
    },
  });
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

**Promise\<[operations.StartJourneyResponse](../../models/operations/start-journey-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |

## getState

Get State Data

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getJourneyState" method="post" path="/journey/state/fetch" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.journeys.getState({
    instanceId: "PiIuACmx8Q8R7qPnAkLAqBAT",
    filterKeys: [
      "/.*/",
    ],
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
    instanceId: "PiIuACmx8Q8R7qPnAkLAqBAT",
    filterKeys: [
      "/.*/",
    ],
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
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |