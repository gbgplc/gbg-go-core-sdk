# SubmitInteractionSessionDevice

## Example Usage

```typescript
import { SubmitInteractionSessionDevice } from "@gbg/go-core/models/operations";

let value: SubmitInteractionSessionDevice = {
  id: "<id>",
  manufacturer: "Honda",
  model: {
    identifier: "<value>",
    name: "<value>",
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `manufacturer`                                                                           | *string*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `model`                                                                                  | [operations.SubmitInteractionModel](../../models/operations/submit-interaction-model.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |