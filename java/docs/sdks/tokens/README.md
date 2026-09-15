# Tokens

## Overview

### Available Operations

* [generate](#generate) - Generate access token

## generate

Get an access token to authenticate API requests. If you're unfamiliar with the authentication process, check out the [authentication guide](/docs/go-v2/developer-integration/execute-customer-journeys/authenticate) for more details.

### Example Usage

<!-- UsageSnippet language="java" operationID="post_/as/token.oauth2" method="post" path="/as/token.oauth2" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.PostAsTokenOauth2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        PostAsTokenOauth2Response res = sdk.tokens().generate()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PostAsTokenOauth2Request](../../models/operations/PostAsTokenOauth2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[PostAsTokenOauth2Response](../../models/operations/PostAsTokenOauth2Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |