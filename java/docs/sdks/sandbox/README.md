# Sandbox

## Overview

### Available Operations

* [createScenario](#createscenario) - Create a sandbox scenario on a journey
* [listScenarios](#listscenarios) - List a journey's sandbox scenarios
* [getScenario](#getscenario) - Read a sandbox scenario
* [putScenario](#putscenario) - Replace a sandbox scenario
* [deleteScenario](#deletescenario) - Delete a sandbox scenario

## createScenario

Creates an org-tier sandbox scenario belonging to the journey in the path. Returns 409 if the name is taken on that journey (the same name may exist on other journeys). The scenario is resolvable at journey-start, for runs of that journey only, via the x-gbg-scenario header. Org is taken from the token.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSandboxScenario" method="post" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.CreateSandboxScenarioRequest;
import com.gbg.gocore.models.CreateSandboxScenarioRequestData;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.CreateSandboxScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        CreateSandboxScenarioResponse res = sdk.sandbox().createScenario()
                .journeyId("onboarding-journey")
                .body(CreateSandboxScenarioRequest.builder()
                    .name("my-scenario")
                    .data(CreateSandboxScenarioRequestData.builder()
                        .build())
                    .build())
                .call();

        if (res.sandboxScenarioWritten().isPresent()) {
            System.out.println(res.sandboxScenarioWritten().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                     | *String*                                                                                        | :heavy_check_mark:                                                                              | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey. | onboarding-journey                                                                              |
| `body`                                                                                          | @Nullable [CreateSandboxScenarioRequest](../../models/CreateSandboxScenarioRequest.md)          | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |

### Response

**[CreateSandboxScenarioResponse](../../models/operations/CreateSandboxScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 409          | application/json            |
| models/errors/ErrorResponse | 503                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listScenarios

Lists the org's sandbox scenarios belonging to the journey in the path — never another journey's. Pass includePlatform=true to also return read-only GBG-provided platform scenarios (available on every journey); an org scenario shadows a platform scenario of the same name.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSandboxScenarios" method="get" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.ListSandboxScenariosResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        ListSandboxScenariosResponse res = sdk.sandbox().listScenarios()
                .journeyId("onboarding-journey")
                .call();

        if (res.sandboxScenarioList().isPresent()) {
            System.out.println(res.sandboxScenarioList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                 | onboarding-journey                                                                                              |
| `includePlatform`                                                                                               | @Nullable [ListSandboxScenariosIncludePlatform](../../models/operations/ListSandboxScenariosIncludePlatform.md) | :heavy_minus_sign:                                                                                              | Include read-only platform-tier scenarios in the listing. Defaults to false.                                    |                                                                                                                 |

### Response

**[ListSandboxScenariosResponse](../../models/operations/ListSandboxScenariosResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403               | application/json            |
| models/errors/ErrorResponse | 503                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getScenario

Reads one org-tier sandbox scenario of the journey in the path. By default does not fall back to the platform tier or to another journey, so a name that exists only at platform level, or only on another journey, returns 404. Pass includePlatform=true to fall back to the read-only GBG-provided scenario of that name; the response `tier` says which tier served it. Another journey is never consulted either way.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSandboxScenario" method="get" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.GetSandboxScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        GetSandboxScenarioResponse res = sdk.sandbox().getScenario()
                .journeyId("onboarding-journey")
                .name("my-scenario")
                .call();

        if (res.sandboxScenario().isPresent()) {
            System.out.println(res.sandboxScenario().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  | Example                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `journeyId`                                                                                                                                                  | *String*                                                                                                                                                     | :heavy_check_mark:                                                                                                                                           | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                                              | onboarding-journey                                                                                                                                           |
| `name`                                                                                                                                                       | *String*                                                                                                                                                     | :heavy_check_mark:                                                                                                                                           | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content.                            | my-scenario                                                                                                                                                  |
| `includePlatform`                                                                                                                                            | @Nullable [GetSandboxScenarioIncludePlatform](../../models/operations/GetSandboxScenarioIncludePlatform.md)                                                  | :heavy_minus_sign:                                                                                                                                           | Fall back to the read-only platform tier when this journey holds no scenario of this name. Defaults to false, which reads this journey&apos;s org tier only. |                                                                                                                                                              |

### Response

**[GetSandboxScenarioResponse](../../models/operations/GetSandboxScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 503                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## putScenario

Replaces an existing org-tier sandbox scenario of the journey in the path. Returns 404 if it does not exist on that journey — use POST to create. Requires UPDATE:journey; creating (POST) requires CREATE:journey, so an edit-only grant cannot mint new scenarios through this endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="putSandboxScenario" method="put" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.UpdateSandboxScenarioRequest;
import com.gbg.gocore.models.UpdateSandboxScenarioRequestData;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.PutSandboxScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        PutSandboxScenarioResponse res = sdk.sandbox().putScenario()
                .journeyId("onboarding-journey")
                .name("my-scenario")
                .body(UpdateSandboxScenarioRequest.builder()
                    .data(UpdateSandboxScenarioRequestData.builder()
                        .build())
                    .build())
                .call();

        if (res.sandboxScenarioWritten().isPresent()) {
            System.out.println(res.sandboxScenarioWritten().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                                       | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                   | onboarding-journey                                                                                                                |
| `name`                                                                                                                            | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content. | my-scenario                                                                                                                       |
| `body`                                                                                                                            | @Nullable [UpdateSandboxScenarioRequest](../../models/UpdateSandboxScenarioRequest.md)                                            | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |

### Response

**[PutSandboxScenarioResponse](../../models/operations/PutSandboxScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 503                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteScenario

Deletes an org-tier sandbox scenario of the journey in the path by archiving it: it disappears from listings and journey-start resolution, but its version history is retained and creating the same name again restores it. A platform scenario of the same name, previously shadowed by this one on this journey, becomes resolvable again at journey-start.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSandboxScenario" method="delete" path="/v2/captain/sandbox/journeys/{journeyId}/scenarios/{name}" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeleteSandboxScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        DeleteSandboxScenarioResponse res = sdk.sandbox().deleteScenario()
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

**[DeleteSandboxScenarioResponse](../../models/operations/DeleteSandboxScenarioResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 503                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |