# Tokens

## Overview

### Available Operations

* [generate](#generate) - Generate access token

## generate

Get an access token to authenticate API requests. If you're unfamiliar with the authentication process, check out the [authentication guide](/docs/developer-integration/execute-customer-journeys/authenticate) for more details.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="post_/auth/realms/go/protocol/openid-connect/token" method="post" path="/auth/realms/go/protocol/openid-connect/token" -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { GoCore } from "@gbg/go-core/core.js";
import { tokensGenerate } from "@gbg/go-core/funcs/tokens-generate.js";

// Use `GoCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const go = new GoCore();

async function run() {
  const res = await tokensGenerate(go, {
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("tokensGenerate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PostAuthRealmsGoProtocolOpenidConnectTokenRequest](../../models/operations/post-auth-realms-go-protocol-openid-connect-token-request.md)                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |
| `options.serverURL`                                                                                                                                                            | *string*                                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                             | An optional server URL to use.                                                                                                                                                 |

### Response

**Promise\<[operations.PostAuthRealmsGoProtocolOpenidConnectTokenResponse](../../models/operations/post-auth-realms-go-protocol-openid-connect-token-response.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.GoDefaultError | 4XX, 5XX              | \*/\*                 |