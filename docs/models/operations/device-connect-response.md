# DeviceConnectResponse

Success

## Example Usage

```typescript
import { DeviceConnectResponse } from "@gbg/go-core/models/operations";

let value: DeviceConnectResponse = {
  expiresIn: 4500.78,
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `endUserToken`                                                                            | *string*                                                                                  | :heavy_minus_sign:                                                                        | Token used for subsequent operations by the client                                        |
| `tokenType`                                                                               | [operations.DeviceConnectTokenType](../../models/operations/device-connect-token-type.md) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `expiresIn`                                                                               | *number*                                                                                  | :heavy_check_mark:                                                                        | Seconds until the token expires                                                           |