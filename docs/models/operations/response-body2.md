# ResponseBody2

## Example Usage

```typescript
import { ResponseBody2 } from "@gbg/go-core/models/operations";

let value: ResponseBody2 = {
  instanceId: "<id>",
  journey: {
    status: "InProgress",
  },
};
```

## Fields

| Field                                                                                                                                                                                   | Type                                                                                                                                                                                    | Required                                                                                                                                                                                | Description                                                                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `instanceId`                                                                                                                                                                            | *string*                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                      | Journey instance identifier                                                                                                                                                             |
| `journey`                                                                                                                                                                               | [operations.Journey2](../../models/operations/journey2.md)                                                                                                                              | :heavy_check_mark:                                                                                                                                                                      | N/A                                                                                                                                                                                     |
| `processing`                                                                                                                                                                            | *boolean*                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                      | True when the journey is still working and no interaction is available yet. Clients should poll /journey/interaction/fetch until this is absent/false and an `interaction` is returned. |