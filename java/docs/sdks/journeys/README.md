# Journeys

## Overview

### Available Operations

* [start](#start) - Start a new journey
* [getState](#getstate) - Fetch journey state
* [getSchemas](#getschemas) - Fetch interaction JSON schemas
* [terminate](#terminate) - Terminate journey

## start

Creates a new journey instance from a resource definition.

### Example Usage

<!-- UsageSnippet language="java" operationID="startJourney" method="post" path="/v2/captain/journey/start" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.StartJourneyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        StartJourneyResponse res = sdk.journeys().start()
                .call();

        if (res.journeyStartResponse().isPresent()) {
            System.out.println(res.journeyStartResponse().get());
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getState

Retrieves the current state of a journey instance.

### Example Usage: Completed

<!-- UsageSnippet language="java" operationID="getJourneyState" method="post" path="/v2/captain/journey/state/fetch" example="Completed" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.SlimStateFetchResponse;
import com.gbg.gocore.models.StateFetchResponse;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetJourneyStateResponse;
import com.gbg.gocore.models.operations.GetJourneyStateResponseBody;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetJourneyStateResponse res = sdk.journeys().getState()
                .view("slim")
                .call();

        if (res.oneOf().isPresent()) {
            GetJourneyStateResponseBody unionValue = res.oneOf().get();
            if (unionValue.stateFetchResponse().isPresent()) {
                StateFetchResponse stateFetchResponseValue = unionValue.stateFetchResponse().get();
                // Handle stateFetchResponse variant
            } else if (unionValue.slimStateFetchResponse().isPresent()) {
                SlimStateFetchResponse slimStateFetchResponseValue = unionValue.slimStateFetchResponse().get();
                // Handle slimStateFetchResponse variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```
### Example Usage: InProgress

<!-- UsageSnippet language="java" operationID="getJourneyState" method="post" path="/v2/captain/journey/state/fetch" example="InProgress" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.SlimStateFetchResponse;
import com.gbg.gocore.models.StateFetchResponse;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetJourneyStateResponse;
import com.gbg.gocore.models.operations.GetJourneyStateResponseBody;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetJourneyStateResponse res = sdk.journeys().getState()
                .view("slim")
                .call();

        if (res.oneOf().isPresent()) {
            GetJourneyStateResponseBody unionValue = res.oneOf().get();
            if (unionValue.stateFetchResponse().isPresent()) {
                StateFetchResponse stateFetchResponseValue = unionValue.stateFetchResponse().get();
                // Handle stateFetchResponse variant
            } else if (unionValue.slimStateFetchResponse().isPresent()) {
                SlimStateFetchResponse slimStateFetchResponseValue = unionValue.slimStateFetchResponse().get();
                // Handle slimStateFetchResponse variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `view`                                                                                                                                                             | @Nullable *String*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                 | Response profile. Omit or 'full' for the full response (default, unchanged). 'slim' returns the compact, typed customer-facing shape. Any other value returns 400. | slim                                                                                                                                                               |
| `body`                                                                                                                                                             | @Nullable [GetJourneyStateRequestBody](../../models/operations/GetJourneyStateRequestBody.md)                                                                      | :heavy_minus_sign:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[GetJourneyStateResponse](../../models/operations/GetJourneyStateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSchemas

Retrieves design-time JSON schemas for the interactions in a delivery — what information the journey
expects a user to complete, which fields are required, and what shape they take.

Identifiers are short on both sides; this endpoint never accepts or returns a GRN.
`resourceId` is the same short identifier `POST /journey/start` takes (`my-delivery@latest`), and the
organization is derived from your token. The response reports the short `deliveryId` plus
`resolvedVersion`, the concrete revision it resolved — join them as `<deliveryId>@<resolvedVersion>` to
pin `/journey/start` to exactly the revision these schemas describe (`@latest` is an alias, not a
snapshot).

Two caveats on that pin. `/journey/start` serves from a cache, so it can briefly run a revision behind
the one described here. And the pin is only startable when the delivery lives in your token's primary
organization: this endpoint also searches organizations granted by the token's `x_orgs` federation
claim, which `/journey/start` does not, so a delivery found only through federation is readable here
but not startable with the same token.

Known limitation on that federated search: a delivery that a parent organization *linked* into yours
is not currently followed to its source and reports 404 here, even though `/journey/start` can run it.

Filters by `interactionId` and/or `instruction` are optional; `instruction` requires `interactionId`.
`interactionId` is the short interaction id (e.g. `segment1`) — a GRN, or a short id carrying an
`@version` suffix, is rejected with 400.

Note: the `interactionId` reported here is a design-time label for reading the journey. It is not the
identifier `POST /journey/interaction/submit` expects — that one comes from
`POST /journey/interaction/fetch`, which uses the runtime's own identifiers.

### Example Usage

<!-- UsageSnippet language="java" operationID="getJourneySchemas" method="post" path="/v2/captain/journey/schema/fetch" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetJourneySchemasResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetJourneySchemasResponse res = sdk.journeys().getSchemas()
                .call();

        if (res.schemaFetchResponse().isPresent()) {
            System.out.println(res.schemaFetchResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetJourneySchemasRequest](../../models/operations/GetJourneySchemasRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetJourneySchemasResponse](../../models/operations/GetJourneySchemasResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404, 422          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## terminate

Terminates an active journey instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="terminateJourney" method="post" path="/v2/captain/journey/terminate" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.TerminateJourneyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        TerminateJourneyResponse res = sdk.journeys().terminate()
                .call();

        if (res.terminateResponse().isPresent()) {
            System.out.println(res.terminateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [TerminateJourneyRequest](../../models/operations/TerminateJourneyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[TerminateJourneyResponse](../../models/operations/TerminateJourneyResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404, 409          | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |