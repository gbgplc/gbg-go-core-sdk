# GetJourneyStateSessionDevice

## Example Usage

```typescript
import { GetJourneyStateSessionDevice } from "@gbg/go-core/models/operations";

let value: GetJourneyStateSessionDevice = {
  id: "<id>",
  manufacturer: "Maserati",
  model: {
    identifier: "<value>",
    name: "<value>",
  },
};
```

## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `id`                                                                                  | *string*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `manufacturer`                                                                        | *string*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `model`                                                                               | [operations.GetJourneyStateModel](../../models/operations/get-journey-state-model.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |