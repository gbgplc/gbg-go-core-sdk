# PostAsTokenOauth2Response

Successfully retrieved access token.

## Example Usage

```typescript
import { PostAsTokenOauth2Response } from "@gbg/go-core/models/operations";

let value: PostAsTokenOauth2Response = {};
```

## Fields

| Field                                     | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `accessToken`                             | *string*                                  | :heavy_minus_sign:                        | The access token used for authentication. |
| `expiresIn`                               | *number*                                  | :heavy_minus_sign:                        | Token expiration time in seconds.         |
| `tokenType`                               | *string*                                  | :heavy_minus_sign:                        | The type of token, usually 'Bearer'.      |