# DeviceConnectRequest

## Example Usage

```typescript
import { DeviceConnectRequest } from "@gbg/go-core/models/operations";

let value: DeviceConnectRequest = {
  connectToken: "<value>",
  deviceInfo: {
    deviceId: "<id>",
  },
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `connectToken`                                                  | *string*                                                        | :heavy_check_mark:                                              | Bearer Token credential for a connection.                       |
| `deviceInfo`                                                    | [operations.DeviceInfo](../../models/operations/device-info.md) | :heavy_check_mark:                                              | N/A                                                             |