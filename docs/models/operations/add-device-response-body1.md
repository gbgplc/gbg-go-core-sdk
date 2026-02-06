# AddDeviceResponseBody1

Success

## Example Usage

```typescript
import { AddDeviceResponseBody1 } from "@gbg/go-core/models/operations";

let value: AddDeviceResponseBody1 = {
  connectToken: "<value>",
  expiresIn: 8112.63,
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `connectToken`                                                                      | *string*                                                                            | :heavy_check_mark:                                                                  | Token used for subsequent operations by the client                                  |
| `tokenType`                                                                         | [operations.AddDeviceTokenType1](../../models/operations/add-device-token-type1.md) | :heavy_minus_sign:                                                                  | N/A                                                                                 |
| `expiresIn`                                                                         | *number*                                                                            | :heavy_check_mark:                                                                  | Seconds until the token expires                                                     |
| `scope`                                                                             | [operations.ScopeResponse1](../../models/operations/scope-response1.md)[]           | :heavy_minus_sign:                                                                  | Scopes granted to the client                                                        |