# DeviceConnectResponseBody2

Success

## Example Usage

```typescript
import { DeviceConnectResponseBody2 } from "@gbg/go-core/models/operations";

let value: DeviceConnectResponseBody2 = {
  expiresIn: 2005,
};
```

## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `endUserToken`                                                                              | *string*                                                                                    | :heavy_minus_sign:                                                                          | Token used for subsequent operations by the client                                          |
| `tokenType`                                                                                 | [operations.DeviceConnectTokenType2](../../models/operations/device-connect-token-type2.md) | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `expiresIn`                                                                                 | *number*                                                                                    | :heavy_check_mark:                                                                          | Seconds until the token expires                                                             |