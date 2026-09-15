# Interactions

## Overview

### Available Operations

* [submit](#submit) - Submit Interaction
* [fetch](#fetch) - Fetch Interaction

## submit

Submit Interaction

### Example Usage: error

<!-- UsageSnippet language="java" operationID="submitInteraction" method="post" path="/journey/interaction/submit" example="error" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.SubmitInteractionResponse;
import com.gbg.gocore.models.operations.SubmitInteractionResponseBody;
import com.gbg.gocore.models.operations.SubmitInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        SubmitInteractionResponse res = sdk.interactions().submit()
                .security(SubmitInteractionSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            SubmitInteractionResponseBody unionValue = res.oneOf().get();
            switch (unionValue.status()) {
                case "success":
                    // Handle success discriminator variant
                    break;
                case "error":
                    // Handle error discriminator variant
                    break;
                default:
                    // Handle unknown discriminator variant
            }
        }
    }
}
```
### Example Usage: success

<!-- UsageSnippet language="java" operationID="submitInteraction" method="post" path="/journey/interaction/submit" example="success" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.SubmitInteractionResponse;
import com.gbg.gocore.models.operations.SubmitInteractionResponseBody;
import com.gbg.gocore.models.operations.SubmitInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        SubmitInteractionResponse res = sdk.interactions().submit()
                .security(SubmitInteractionSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            SubmitInteractionResponseBody unionValue = res.oneOf().get();
            switch (unionValue.status()) {
                case "success":
                    // Handle success discriminator variant
                    break;
                case "error":
                    // Handle error discriminator variant
                    break;
                default:
                    // Handle unknown discriminator variant
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [SubmitInteractionRequest](../../models/operations/SubmitInteractionRequest.md)                                    | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.gbg.gocore.models.operations.SubmitInteractionSecurity](../../models/operations/SubmitInteractionSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |

### Response

**[SubmitInteractionResponse](../../models/operations/SubmitInteractionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## fetch

Fetch Interaction

### Example Usage: error

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/journey/interaction/fetch" example="error" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.FetchInteractionError;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import com.gbg.gocore.models.operations.ResponseBody1;
import com.gbg.gocore.models.operations.ResponseBody2;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.responseBody1().isPresent()) {
                ResponseBody1 responseBody1Value = unionValue.responseBody1().get();
                // Handle responseBody1 variant
            } else if (unionValue.fetchInteractionError().isPresent()) {
                FetchInteractionError fetchInteractionErrorValue = unionValue.fetchInteractionError().get();
                // Handle fetchInteractionError variant
            } else if (unionValue.responseBody2().isPresent()) {
                ResponseBody2 responseBody2Value = unionValue.responseBody2().get();
                // Handle responseBody2 variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```
### Example Usage: processing

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/journey/interaction/fetch" example="processing" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.FetchInteractionError;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import com.gbg.gocore.models.operations.ResponseBody1;
import com.gbg.gocore.models.operations.ResponseBody2;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.responseBody1().isPresent()) {
                ResponseBody1 responseBody1Value = unionValue.responseBody1().get();
                // Handle responseBody1 variant
            } else if (unionValue.fetchInteractionError().isPresent()) {
                FetchInteractionError fetchInteractionErrorValue = unionValue.fetchInteractionError().get();
                // Handle fetchInteractionError variant
            } else if (unionValue.responseBody2().isPresent()) {
                ResponseBody2 responseBody2Value = unionValue.responseBody2().get();
                // Handle responseBody2 variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```
### Example Usage: success

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/journey/interaction/fetch" example="success" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.FetchInteractionError;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import com.gbg.gocore.models.operations.ResponseBody1;
import com.gbg.gocore.models.operations.ResponseBody2;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.responseBody1().isPresent()) {
                ResponseBody1 responseBody1Value = unionValue.responseBody1().get();
                // Handle responseBody1 variant
            } else if (unionValue.fetchInteractionError().isPresent()) {
                FetchInteractionError fetchInteractionErrorValue = unionValue.fetchInteractionError().get();
                // Handle fetchInteractionError variant
            } else if (unionValue.responseBody2().isPresent()) {
                ResponseBody2 responseBody2Value = unionValue.responseBody2().get();
                // Handle responseBody2 variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [FetchInteractionRequest](../../models/operations/FetchInteractionRequest.md)                                    | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [com.gbg.gocore.models.operations.FetchInteractionSecurity](../../models/operations/FetchInteractionSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |

### Response

**[FetchInteractionResponse](../../models/operations/FetchInteractionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |