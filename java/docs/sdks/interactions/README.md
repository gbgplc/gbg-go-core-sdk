# Interactions

## Overview

### Available Operations

* [fetch](#fetch) - Fetch current interaction
* [submit](#submit) - Submit interaction data
* [uploadAsset](#uploadasset) - Stream an interaction asset to storage

## fetch

Retrieves the current interaction state for a journey instance.

### Example Usage: error

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="error" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.InteractionFetchResponse;
import com.gbg.gocore.models.SlimInteractionFetchResponse;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .view("slim")
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.interactionFetchResponse().isPresent()) {
                InteractionFetchResponse interactionFetchResponseValue = unionValue.interactionFetchResponse().get();
                // Handle interactionFetchResponse variant
            } else if (unionValue.slimInteractionFetchResponse().isPresent()) {
                SlimInteractionFetchResponse slimInteractionFetchResponseValue = unionValue.slimInteractionFetchResponse().get();
                // Handle slimInteractionFetchResponse variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```
### Example Usage: processing

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="processing" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.InteractionFetchResponse;
import com.gbg.gocore.models.SlimInteractionFetchResponse;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .view("slim")
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.interactionFetchResponse().isPresent()) {
                InteractionFetchResponse interactionFetchResponseValue = unionValue.interactionFetchResponse().get();
                // Handle interactionFetchResponse variant
            } else if (unionValue.slimInteractionFetchResponse().isPresent()) {
                SlimInteractionFetchResponse slimInteractionFetchResponseValue = unionValue.slimInteractionFetchResponse().get();
                // Handle slimInteractionFetchResponse variant
            } else if (unionValue.asJson().isPresent()) {
                JsonNode raw = unionValue.asJson().get();
                // Handle unknown variant fallback
            }
        }
    }
}
```
### Example Usage: success

<!-- UsageSnippet language="java" operationID="fetchInteraction" method="post" path="/v2/captain/journey/interaction/fetch" example="success" -->
```java
package hello.world;

import com.fasterxml.jackson.databind.JsonNode;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.InteractionFetchResponse;
import com.gbg.gocore.models.SlimInteractionFetchResponse;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponse;
import com.gbg.gocore.models.operations.FetchInteractionResponseBody;
import com.gbg.gocore.models.operations.FetchInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        FetchInteractionResponse res = sdk.interactions().fetch()
                .security(FetchInteractionSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .view("slim")
                .call();

        if (res.oneOf().isPresent()) {
            FetchInteractionResponseBody unionValue = res.oneOf().get();
            if (unionValue.interactionFetchResponse().isPresent()) {
                InteractionFetchResponse interactionFetchResponseValue = unionValue.interactionFetchResponse().get();
                // Handle interactionFetchResponse variant
            } else if (unionValue.slimInteractionFetchResponse().isPresent()) {
                SlimInteractionFetchResponse slimInteractionFetchResponseValue = unionValue.slimInteractionFetchResponse().get();
                // Handle slimInteractionFetchResponse variant
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
| `security`                                                                                                                                                         | [com.gbg.gocore.models.operations.FetchInteractionSecurity](../../models/operations/FetchInteractionSecurity.md)                                                   | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |                                                                                                                                                                    |
| `view`                                                                                                                                                             | @Nullable *String*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                 | Response profile. Omit or 'full' for the full response (default, unchanged). 'slim' returns the compact, typed customer-facing shape. Any other value returns 400. | slim                                                                                                                                                               |
| `body`                                                                                                                                                             | @Nullable [FetchInteractionRequestBody](../../models/operations/FetchInteractionRequestBody.md)                                                                    | :heavy_minus_sign:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[FetchInteractionResponse](../../models/operations/FetchInteractionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 404               | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## submit

Submits participant data for an interaction.

### Example Usage: error

<!-- UsageSnippet language="java" operationID="submitInteraction" method="post" path="/v2/captain/journey/interaction/submit" example="error" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.SubmitInteractionResponse;
import com.gbg.gocore.models.operations.SubmitInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        SubmitInteractionResponse res = sdk.interactions().submit()
                .security(SubmitInteractionSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .call();

        if (res.interactionSubmitResponse().isPresent()) {
            System.out.println(res.interactionSubmitResponse().get());
        }
    }
}
```
### Example Usage: success

<!-- UsageSnippet language="java" operationID="submitInteraction" method="post" path="/v2/captain/journey/interaction/submit" example="success" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.SubmitInteractionResponse;
import com.gbg.gocore.models.operations.SubmitInteractionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        SubmitInteractionResponse res = sdk.interactions().submit()
                .security(SubmitInteractionSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .call();

        if (res.interactionSubmitResponse().isPresent()) {
            System.out.println(res.interactionSubmitResponse().get());
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 409, 429          | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## uploadAsset

Streams a raw asset body (application/octet-stream) to storage and returns its gofs key. Identifiers are passed as X-Instance-Id, X-Interaction-Id and X-Domain-Element-Id headers. Accepts capture elements: the encrypted selfie (EncryptedSelfie/selfieImage), the plain selfie (Selfie/selfieImage), and both document sides (PrimaryDocument/side1Image, PrimaryDocument/side2Image). An element the current deployment does not accept returns 422 — submit that asset inline (base64) in the interaction submit instead.

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadInteractionAsset" method="post" path="/v2/captain/journey/interaction/asset/upload" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.UploadInteractionAssetResponse;
import com.gbg.gocore.models.operations.UploadInteractionAssetSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        UploadInteractionAssetResponse res = sdk.interactions().uploadAsset()
                .security(UploadInteractionAssetSecurity.builder()
                    .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
                    .build())
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                   | [com.gbg.gocore.models.operations.UploadInteractionAssetSecurity](../../models/operations/UploadInteractionAssetSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |

### Response

**[UploadInteractionAssetResponse](../../models/operations/UploadInteractionAssetResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 409, 422, 429 | application/json             |
| models/errors/ErrorResponse  | 500, 503                     | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |