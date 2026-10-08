# DeviceConnectResponse

## Example Usage

```typescript
import { DeviceConnectResponse } from "@gbg/go-core/models";

let value: DeviceConnectResponse = {
  endUserToken: "<value>",
  tokenType: "end-user",
  expiresIn: 4500.78,
  instanceId: "<id>",
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `endUserToken`                                                                           | *string*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `tokenType`                                                                              | [models.DeviceConnectResponseTokenType](../models/device-connect-response-token-type.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `expiresIn`                                                                              | *number*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `instanceId`                                                                             | *string*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `resumeCredential`                                                                       | *string*                                                                                 | :heavy_minus_sign:                                                                       | N/A                                                                                      |
| `credentialExpiresAt`                                                                    | *string*                                                                                 | :heavy_minus_sign:                                                                       | N/A                                                                                      |
| `credentialExpiresIn`                                                                    | *number*                                                                                 | :heavy_minus_sign:                                                                       | N/A                                                                                      |