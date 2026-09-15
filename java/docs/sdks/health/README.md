# Health

## Overview

### Available Operations

* [get](#get) - Obtain the flow-captain health status

## get

Obtain the flow-captain health status

### Example Usage

<!-- UsageSnippet language="java" operationID="health" method="get" path="/journey/health" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.HealthResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        HealthResponse res = sdk.health().get()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Response

**[HealthResponse](../../models/operations/HealthResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |