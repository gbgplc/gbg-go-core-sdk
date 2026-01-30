# AddDeviceResponse

Success

## Example Usage

```typescript
import { AddDeviceResponse } from "@gbg/go-core/models/operations";

let value: AddDeviceResponse = {
  connectToken: "<value>",
  expiresIn: 4436.96,
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `connectToken`                                                                    | *string*                                                                          | :heavy_check_mark:                                                                | Token used for subsequent operations by the client                                |
| `tokenType`                                                                       | [operations.AddDeviceTokenType](../../models/operations/add-device-token-type.md) | :heavy_minus_sign:                                                                | N/A                                                                               |
| `expiresIn`                                                                       | *number*                                                                          | :heavy_check_mark:                                                                | Seconds until the token expires                                                   |
| `scope`                                                                           | [operations.ScopeResponse](../../models/operations/scope-response.md)[]           | :heavy_minus_sign:                                                                | Scopes granted to the client                                                      |