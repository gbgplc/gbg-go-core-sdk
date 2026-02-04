# PostAuthRealmsGoProtocolOpenidConnectTokenResponse

Successfully retrieved access token.

## Example Usage

```typescript
import { PostAuthRealmsGoProtocolOpenidConnectTokenResponse } from "@gbg/go-core/models/operations";

let value: PostAuthRealmsGoProtocolOpenidConnectTokenResponse = {
  accessToken: "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  expiresIn: 3600,
  tokenType: "Bearer",
};
```

## Fields

| Field                                     | Type                                      | Required                                  | Description                               | Example                                   |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `accessToken`                             | *string*                                  | :heavy_minus_sign:                        | The access token used for authentication. | eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...   |
| `expiresIn`                               | *number*                                  | :heavy_minus_sign:                        | Token expiration time in seconds.         | 3600                                      |
| `tokenType`                               | *string*                                  | :heavy_minus_sign:                        | The type of token, usually 'Bearer'.      | Bearer                                    |