# Instances

## Overview

### Available Operations

* [delete](#delete) - Delete instance

## delete

Delete instance

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteInstance" method="post" path="/journey/state/delete" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.instances.delete({
    instanceId: "PiIuACmx8Q8R7qPnAkLAqBAT",
  });

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
  const res = await instancesDelete(go, {
    instanceId: "PiIuACmx8Q8R7qPnAkLAqBAT",
  });
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

**Promise\<[operations.DeleteInstanceResponse](../../models/operations/delete-instance-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |