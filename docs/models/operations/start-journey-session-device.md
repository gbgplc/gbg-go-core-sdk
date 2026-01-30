# StartJourneySessionDevice

## Example Usage

```typescript
import { StartJourneySessionDevice } from "@gbg/go-core/models/operations";

let value: StartJourneySessionDevice = {
  id: "<id>",
  manufacturer: "Honda",
  model: {
    identifier: "<value>",
    name: "<value>",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `id`                                                                           | *string*                                                                       | :heavy_check_mark:                                                             | N/A                                                                            |
| `manufacturer`                                                                 | *string*                                                                       | :heavy_check_mark:                                                             | N/A                                                                            |
| `model`                                                                        | [operations.StartJourneyModel](../../models/operations/start-journey-model.md) | :heavy_check_mark:                                                             | N/A                                                                            |