# PostAuthRealmsGoProtocolOpenidConnectTokenRequest

## Example Usage

```typescript
import { PostAuthRealmsGoProtocolOpenidConnectTokenRequest } from "@gbg/go-core/models/operations";

let value: PostAuthRealmsGoProtocolOpenidConnectTokenRequest = {
  clientId: "your-client-id",
  clientSecret: "your-client-secret",
  username: "api-user@example.com",
  password: "your-secure-password",
  grantType: "password",
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `clientId`                                                    | *string*                                                      | :heavy_check_mark:                                            | The client ID assigned to your organization.                  | your_client_id                                                |
| `clientSecret`                                                | *string*                                                      | :heavy_check_mark:                                            | The client secret assigned to your organization.              | your_client_secret                                            |
| `username`                                                    | *string*                                                      | :heavy_check_mark:                                            | The username for API authentication.                          | your_username                                                 |
| `password`                                                    | *string*                                                      | :heavy_check_mark:                                            | The password for API authentication.                          | your_password                                                 |
| `grantType`                                                   | [operations.GrantType](../../models/operations/grant-type.md) | :heavy_check_mark:                                            | Must always be set to 'password'.                             | password                                                      |