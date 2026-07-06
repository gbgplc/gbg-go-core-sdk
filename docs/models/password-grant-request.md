# PasswordGrantRequest

## Example Usage

```typescript
import { PasswordGrantRequest } from "@gbg/go-core/models";

let value: PasswordGrantRequest = {
  clientId: "<id>",
  clientSecret: "<value>",
  username: "Kristoffer80",
  password: "45Sd_nsD1s_1ImM",
  grantType: "password",
};
```

## Fields

| Field                                            | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `clientId`                                       | *string*                                         | :heavy_check_mark:                               | The client ID assigned to your organization.     |
| `clientSecret`                                   | *string*                                         | :heavy_check_mark:                               | The client secret assigned to your organization. |
| `username`                                       | *string*                                         | :heavy_check_mark:                               | The username for API authentication.             |
| `password`                                       | *string*                                         | :heavy_check_mark:                               | The password for API authentication.             |
| `grantType`                                      | *"password"*                                     | :heavy_check_mark:                               | Must always be set to 'password'.                |