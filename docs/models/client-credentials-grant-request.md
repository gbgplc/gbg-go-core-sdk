# ClientCredentialsGrantRequest

## Example Usage

```typescript
import { ClientCredentialsGrantRequest } from "@gbg/go-core/models";

let value: ClientCredentialsGrantRequest = {
  clientId: "<id>",
  clientSecret: "<value>",
  grantType: "client_credentials",
};
```

## Fields

| Field                                            | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `clientId`                                       | *string*                                         | :heavy_check_mark:                               | The client ID assigned to your organization.     |
| `clientSecret`                                   | *string*                                         | :heavy_check_mark:                               | The client secret assigned to your organization. |
| `grantType`                                      | *"client_credentials"*                           | :heavy_check_mark:                               | Must always be set to 'client_credentials'.      |