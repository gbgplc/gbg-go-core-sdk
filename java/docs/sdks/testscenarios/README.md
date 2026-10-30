# TestScenarios

## Overview

### Available Operations

* [create](#create) - Create a test scenario on a journey
* [list](#list) - List a journey's test scenarios
* [get](#get) - Read a test scenario
* [put](#put) - Replace a test scenario
* [delete](#delete) - Delete a test scenario

## create

Creates an org-tier test scenario belonging to the journey in the path. Returns 409 if the name is taken on that journey (the same name may exist on other journeys). The scenario is resolvable at journey-start, for runs of that journey only, via the x-gbg-scenario header. Org is taken from the token.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTestScenario" method="post" path="/test/journeys/{journeyId}/scenarios" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.CreateTestScenarioRequest;
import com.gbg.gocore.models.CreateTestScenarioRequestData;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.CreateTestScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        CreateTestScenarioResponse res = sdk.testScenarios().create()
                .journeyId("onboarding-journey")
                .body(CreateTestScenarioRequest.builder()
                    .name("my-scenario")
                    .data(CreateTestScenarioRequestData.builder()
                        .build())
                    .build())
                .call();

        if (res.testScenarioWritten().isPresent()) {
            System.out.println(res.testScenarioWritten().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                     | *String*                                                                                        | :heavy_check_mark:                                                                              | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey. | onboarding-journey                                                                              |
| `body`                                                                                          | @Nullable [CreateTestScenarioRequest](../../models/CreateTestScenarioRequest.md)                | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |

### Response

**[CreateTestScenarioResponse](../../models/operations/CreateTestScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 409          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## list

Lists the org's test scenarios belonging to the journey in the path — never another journey's. Pass includePlatform=true to also return read-only GBG-provided platform scenarios (available on every journey); an org scenario shadows a platform scenario of the same name.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTestScenarios" method="get" path="/test/journeys/{journeyId}/scenarios" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.ListTestScenariosResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        ListTestScenariosResponse res = sdk.testScenarios().list()
                .journeyId("onboarding-journey")
                .call();

        if (res.testScenarioList().isPresent()) {
            System.out.println(res.testScenarioList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                               | *String*                                                                                                  | :heavy_check_mark:                                                                                        | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.           | onboarding-journey                                                                                        |
| `includePlatform`                                                                                         | @Nullable [ListTestScenariosIncludePlatform](../../models/operations/ListTestScenariosIncludePlatform.md) | :heavy_minus_sign:                                                                                        | Include read-only platform-tier scenarios in the listing. Defaults to false.                              |                                                                                                           |

### Response

**[ListTestScenariosResponse](../../models/operations/ListTestScenariosResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403               | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## get

Reads one org-tier test scenario of the journey in the path. By default does not fall back to the platform tier or to another journey, so a name that exists only at platform level, or only on another journey, returns 404. Pass includePlatform=true to fall back to the read-only GBG-provided scenario of that name; the response `tier` says which tier served it. Another journey is never consulted either way.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTestScenario" method="get" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetTestScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetTestScenarioResponse res = sdk.testScenarios().get()
                .journeyId("onboarding-journey")
                .name("my-scenario")
                .call();

        if (res.testScenario().isPresent()) {
            System.out.println(res.testScenario().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  | Example                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `journeyId`                                                                                                                                                  | *String*                                                                                                                                                     | :heavy_check_mark:                                                                                                                                           | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                                              | onboarding-journey                                                                                                                                           |
| `name`                                                                                                                                                       | *String*                                                                                                                                                     | :heavy_check_mark:                                                                                                                                           | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content.                            | my-scenario                                                                                                                                                  |
| `includePlatform`                                                                                                                                            | @Nullable [GetTestScenarioIncludePlatform](../../models/operations/GetTestScenarioIncludePlatform.md)                                                        | :heavy_minus_sign:                                                                                                                                           | Fall back to the read-only platform tier when this journey holds no scenario of this name. Defaults to false, which reads this journey&apos;s org tier only. |                                                                                                                                                              |

### Response

**[GetTestScenarioResponse](../../models/operations/GetTestScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## put

Replaces an existing org-tier test scenario of the journey in the path. Returns 404 if it does not exist on that journey — use POST to create. Requires UPDATE:journey; creating (POST) requires CREATE:journey, so an edit-only grant cannot mint new scenarios through this endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="putTestScenario" method="put" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.UpdateTestScenarioRequest;
import com.gbg.gocore.models.UpdateTestScenarioRequestData;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.PutTestScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        PutTestScenarioResponse res = sdk.testScenarios().put()
                .journeyId("onboarding-journey")
                .name("my-scenario")
                .body(UpdateTestScenarioRequest.builder()
                    .data(UpdateTestScenarioRequestData.builder()
                        .build())
                    .build())
                .call();

        if (res.testScenarioWritten().isPresent()) {
            System.out.println(res.testScenarioWritten().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                                       | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                   | onboarding-journey                                                                                                                |
| `name`                                                                                                                            | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content. | my-scenario                                                                                                                       |
| `body`                                                                                                                            | @Nullable [UpdateTestScenarioRequest](../../models/UpdateTestScenarioRequest.md)                                                  | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |

### Response

**[PutTestScenarioResponse](../../models/operations/PutTestScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## delete

Deletes an org-tier test scenario of the journey in the path by archiving it: it disappears from listings and journey-start resolution, but its version history is retained and creating the same name again restores it. A platform scenario of the same name, previously shadowed by this one on this journey, becomes resolvable again at journey-start.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteTestScenario" method="delete" path="/test/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeleteTestScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        DeleteTestScenarioResponse res = sdk.testScenarios().delete()
                .journeyId("onboarding-journey")
                .name("my-scenario")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                                       | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                   | onboarding-journey                                                                                                                |
| `name`                                                                                                                            | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content. | my-scenario                                                                                                                       |

### Response

**[DeleteTestScenarioResponse](../../models/operations/DeleteTestScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 500, 503                    | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |