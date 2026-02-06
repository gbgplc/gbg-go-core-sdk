# AddDeviceResponseBody2

Success

## Example Usage

```typescript
import { AddDeviceResponseBody2 } from "@gbg/go-core/models/operations";

let value: AddDeviceResponseBody2 = {
  connectToken: "<value>",
  expiresIn: 9038.19,
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `connectToken`                                                                      | *string*                                                                            | :heavy_check_mark:                                                                  | Token used for subsequent operations by the client                                  |
| `tokenType`                                                                         | [operations.AddDeviceTokenType2](../../models/operations/add-device-token-type2.md) | :heavy_minus_sign:                                                                  | N/A                                                                                 |
| `expiresIn`                                                                         | *number*                                                                            | :heavy_check_mark:                                                                  | Seconds until the token expires                                                     |
| `scope`                                                                             | [operations.ScopeResponse2](../../models/operations/scope-response2.md)[]           | :heavy_minus_sign:                                                                  | Scopes granted to the client                                                        |