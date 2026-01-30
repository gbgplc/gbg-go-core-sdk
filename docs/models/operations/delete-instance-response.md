# DeleteInstanceResponse

Delete instance response contains the Journey Instance Id

## Example Usage

```typescript
import { DeleteInstanceResponse } from "@gbg/go-core/models/operations";

let value: DeleteInstanceResponse = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `additionalProperties`                                                   | Record<string, *any*>                                                    | :heavy_minus_sign:                                                       | N/A                                                                      |