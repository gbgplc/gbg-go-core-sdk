# Journeys

## Overview

### Available Operations

* [start](#start) - Start Journey
* [getState](#getstate) - Get State Data

## start

Start Journey

### Example Usage

<!-- UsageSnippet language="java" operationID="startJourney" method="post" path="/journey/start" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.StartJourneyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        StartJourneyResponse res = sdk.journeys().start()
                .call();

        if (res.twoHundredApplicationJsonObject().isPresent()) {
            System.out.println(res.twoHundredApplicationJsonObject().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [StartJourneyRequest](../../models/operations/StartJourneyRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[StartJourneyResponse](../../models/operations/StartJourneyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getState

Get State Data

### Example Usage: Completed

<!-- UsageSnippet language="java" operationID="getJourneyState" method="post" path="/journey/state/fetch" example="Completed" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.GetJourneyStateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetJourneyStateResponse res = sdk.journeys().getState()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```
### Example Usage: InProgress

<!-- UsageSnippet language="java" operationID="getJourneyState" method="post" path="/journey/state/fetch" example="InProgress" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.GetJourneyStateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetJourneyStateResponse res = sdk.journeys().getState()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetJourneyStateRequest](../../models/operations/GetJourneyStateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetJourneyStateResponse](../../models/operations/GetJourneyStateResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |