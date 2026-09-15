# Tasks

## Overview

### Available Operations

* [list](#list) - Get End User Tasks
* [update](#update) - Put End User Data
* [getSchema](#getschema) - Get Task Schema
* [listSchema](#listschema) - Get Tasks Schema

## list

Get End User Tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="getTasks" method="post" path="/journey/task/list" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.GetTasksResponse;
import com.gbg.gocore.models.operations.GetTasksSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        GetTasksResponse res = sdk.tasks().list()
                .security(GetTasksSecurity.builder()
                    .pingID(System.getenv().getOrDefault("PING_ID", ""))
                    .build())
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [GetTasksRequest](../../models/operations/GetTasksRequest.md)                                    | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `security`                                                                                       | [com.gbg.gocore.models.operations.GetTasksSecurity](../../models/operations/GetTasksSecurity.md) | :heavy_check_mark:                                                                               | The security requirements to use for the request.                                                |

### Response

**[GetTasksResponse](../../models/operations/GetTasksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Put End User Data

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTask" method="post" path="/journey/task/update" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.UpdateTaskResponse;
import com.gbg.gocore.models.operations.UpdateTaskSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        UpdateTaskResponse res = sdk.tasks().update()
                .security(UpdateTaskSecurity.builder()
                    .pingID(System.getenv().getOrDefault("PING_ID", ""))
                    .build())
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [UpdateTaskRequest](../../models/operations/UpdateTaskRequest.md)                                    | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `security`                                                                                           | [com.gbg.gocore.models.operations.UpdateTaskSecurity](../../models/operations/UpdateTaskSecurity.md) | :heavy_check_mark:                                                                                   | The security requirements to use for the request.                                                    |

### Response

**[UpdateTaskResponse](../../models/operations/UpdateTaskResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getSchema

Get Task Schema

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskSchema" method="post" path="/journey/task/schema" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.GetTaskSchemaResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetTaskSchemaResponse res = sdk.tasks().getSchema()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listSchema

Get Tasks Schema

### Example Usage

<!-- UsageSnippet language="java" operationID="getTasksSchema" method="post" path="/journey/task/list/schema" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.GetTasksSchemaResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetTasksSchemaResponse res = sdk.tasks().listSchema()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTasksSchemaRequest](../../models/operations/GetTasksSchemaRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTasksSchemaResponse](../../models/operations/GetTasksSchemaResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |