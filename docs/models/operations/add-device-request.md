# AddDeviceRequest

## Example Usage

```typescript
import { AddDeviceRequest } from "@gbg/go-core/models/operations";

let value: AddDeviceRequest = {
  instanceId: "<id>",
  scope: [],
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `scope`                                                                  | [operations.ScopeRequest](../../models/operations/scope-request.md)[]    | :heavy_check_mark:                                                       | N/A                                                                      |