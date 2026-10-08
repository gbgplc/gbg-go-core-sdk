# AddDeviceRequest

## Example Usage

```typescript
import { AddDeviceRequest } from "@gbg/go-core/models/operations";

let value: AddDeviceRequest = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `instanceId`                                                               | *string*                                                                   | :heavy_check_mark:                                                         | Journey Instance Id, a unique identifier for a started journey instance.   |
| `scope`                                                                    | [operations.AddDeviceScope](../../models/operations/add-device-scope.md)[] | :heavy_minus_sign:                                                         | N/A                                                                        |
| `additionalProperties`                                                     | Record<string, *any*>                                                      | :heavy_minus_sign:                                                         | N/A                                                                        |