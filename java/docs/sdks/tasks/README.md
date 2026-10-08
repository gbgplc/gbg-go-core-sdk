# ~~Tasks~~

> [!WARNING]
> This SDK is **DEPRECATED**

## Overview

### Available Operations

* [~~getSchema~~](#getschema) - Fetch V1-compat task schema :warning: **Deprecated**

## ~~getSchema~~

V1 compatibility shim. Returns a Draft-07 JSON Schema for the active interaction of the journey identified by taskId (taskId = V2 instanceId), or { processing: true } while modules execute.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskSchema" method="post" path="/v2/captain/journey/task/schema" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetTaskSchemaResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetTaskSchemaResponse res = sdk.tasks().getSchema()
                .call();

        if (res.taskSchemaResponse().isPresent()) {
            System.out.println(res.taskSchemaResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetTaskSchemaRequest](../../models/operations/GetTaskSchemaRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetTaskSchemaResponse](../../models/operations/GetTaskSchemaResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |