# Instances

## Overview

### Available Operations

* [delete](#delete) - Delete instance

## delete

Delete instance

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteInstance" method="post" path="/journey/state/delete" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.DeleteInstanceRequest;
import com.gbg.gocore.models.operations.DeleteInstanceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        DeleteInstanceRequest req = DeleteInstanceRequest.builder()
                .instanceId("PiIuACmx8Q8R7qPnAkLAqBAT")
                .build();

        DeleteInstanceResponse res = sdk.instances().delete()
                .request(req)
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
| `request`                                                                 | [DeleteInstanceRequest](../../models/operations/DeleteInstanceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeleteInstanceResponse](../../models/operations/DeleteInstanceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |