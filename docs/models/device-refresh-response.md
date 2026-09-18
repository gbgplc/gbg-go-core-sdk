# DeviceRefreshResponse

## Example Usage

```typescript
import { DeviceRefreshResponse } from "@gbg/go-core/models";

let value: DeviceRefreshResponse = {
  endUserToken: "<value>",
  expiresIn: 2767.52,
  instanceId: "<id>",
  resumeCredential: "<value>",
  credentialExpiresAt: "<value>",
  credentialExpiresIn: 7883.41,
  linkExpiresAt: "<value>",
};
```

## Fields

| Field                 | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `endUserToken`        | *string*              | :heavy_check_mark:    | N/A                   |
| `expiresIn`           | *number*              | :heavy_check_mark:    | N/A                   |
| `instanceId`          | *string*              | :heavy_check_mark:    | N/A                   |
| `resumeCredential`    | *string*              | :heavy_check_mark:    | N/A                   |
| `credentialExpiresAt` | *string*              | :heavy_check_mark:    | N/A                   |
| `credentialExpiresIn` | *number*              | :heavy_check_mark:    | N/A                   |
| `linkExpiresAt`       | *string*              | :heavy_check_mark:    | N/A                   |