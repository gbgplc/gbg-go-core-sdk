# Addresses

## Overview

### Available Operations

* [search](#search) - Search addresses via Loqate Capture
* [retrieve](#retrieve) - Retrieve full address via Loqate Capture

## search

Server-side proxy for the Loqate Capture Find endpoint. Returns address suggestions for a free-text query; the Loqate API key is held server-side and never reaches the browser.

### Example Usage

<!-- UsageSnippet language="java" operationID="searchAddresses" method="post" path="/v2/captain/journey/loqate/search" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.SearchAddressesResponse;
import com.gbg.gocore.models.operations.SearchAddressesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        SearchAddressesResponse res = sdk.addresses().search()
                .security(SearchAddressesSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .call();

        if (res.loqateSearchResponse().isPresent()) {
            System.out.println(res.loqateSearchResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [SearchAddressesRequest](../../models/operations/SearchAddressesRequest.md)                                    | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [com.gbg.gocore.models.operations.SearchAddressesSecurity](../../models/operations/SearchAddressesSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |

### Response

**[SearchAddressesResponse](../../models/operations/SearchAddressesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## retrieve

Server-side proxy for the Loqate Capture Retrieve endpoint. Returns the full address detail for a given Loqate address ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="retrieveAddress" method="post" path="/v2/captain/journey/loqate/retrieve" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.RetrieveAddressResponse;
import com.gbg.gocore.models.operations.RetrieveAddressSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        RetrieveAddressResponse res = sdk.addresses().retrieve()
                .security(RetrieveAddressSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .call();

        if (res.loqateRetrieveResponse().isPresent()) {
            System.out.println(res.loqateRetrieveResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [RetrieveAddressRequest](../../models/operations/RetrieveAddressRequest.md)                                    | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [com.gbg.gocore.models.operations.RetrieveAddressSecurity](../../models/operations/RetrieveAddressSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |

### Response

**[RetrieveAddressResponse](../../models/operations/RetrieveAddressResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |