# DeviceStartResponse

## Example Usage

```typescript
import { DeviceStartResponse } from "@gbg/go-core/models";

let value: DeviceStartResponse = {
  connectToken: "<value>",
  tokenType: "connect",
  expiresIn: 541.72,
  scope: [
    "<value 1>",
  ],
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `connectToken`                                                                       | *string*                                                                             | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `tokenType`                                                                          | [models.DeviceStartResponseTokenType](../models/device-start-response-token-type.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `expiresIn`                                                                          | *number*                                                                             | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `scope`                                                                              | *string*[]                                                                           | :heavy_check_mark:                                                                   | N/A                                                                                  |