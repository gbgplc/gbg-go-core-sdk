# Instances

## Overview

### Available Operations

* [handoffToken](#handofftoken) - Mint a fresh position-scoped handoff token
* [delete](#delete) - Delete journey state

## handoffToken

Mints a fresh page-mode delivery-token + connect-secret pair pointing at the same instance, stamped devicePosition=joined, so a second device can join. Device-token only, and only from the device that started the journey; customer tokens and already-joined devices are rejected with 403. Returns { instanceUrl, devicePosition, expiresIn }.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHandoffToken" method="post" path="/v2/captain/journey/instance/{instanceId}/handoff-token" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.CreateHandoffTokenResponse;
import com.gbg.gocore.models.operations.CreateHandoffTokenSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        CreateHandoffTokenResponse res = sdk.instances().handoffToken()
                .security(CreateHandoffTokenSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .instanceId("<id>")
                .call();

        if (res.handoffTokenResponse().isPresent()) {
            System.out.println(res.handoffTokenResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                           | [com.gbg.gocore.models.operations.CreateHandoffTokenSecurity](../../models/operations/CreateHandoffTokenSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `instanceId`                                                                                                         | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |

### Response

**[CreateHandoffTokenResponse](../../models/operations/CreateHandoffTokenResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## delete

Permanently deletes a completed journey instance (REQ-02-002).

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteInstance" method="post" path="/v2/captain/journey/state/delete" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeleteInstanceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        DeleteInstanceResponse res = sdk.instances().delete()
                .call();

        if (res.deleteResponse().isPresent()) {
            System.out.println(res.deleteResponse().get());
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |