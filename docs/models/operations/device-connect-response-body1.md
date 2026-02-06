# DeviceConnectResponseBody1

Success

## Example Usage

```typescript
import { DeviceConnectResponseBody1 } from "@gbg/go-core/models/operations";

let value: DeviceConnectResponseBody1 = {
  expiresIn: 707.02,
};
```

## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `endUserToken`                                                                              | *string*                                                                                    | :heavy_minus_sign:                                                                          | Token used for subsequent operations by the client                                          |
| `tokenType`                                                                                 | [operations.DeviceConnectTokenType1](../../models/operations/device-connect-token-type1.md) | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `expiresIn`                                                                                 | *number*                                                                                    | :heavy_check_mark:                                                                          | Seconds until the token expires                                                             |