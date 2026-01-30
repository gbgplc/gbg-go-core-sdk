# FetchInteractionSessionDevice

## Example Usage

```typescript
import { FetchInteractionSessionDevice } from "@gbg/go-core/models/operations";

let value: FetchInteractionSessionDevice = {
  id: "<id>",
  manufacturer: "Volvo",
  model: {
    identifier: "<value>",
    name: "<value>",
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *string*                                                                               | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `manufacturer`                                                                         | *string*                                                                               | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `model`                                                                                | [operations.FetchInteractionModel](../../models/operations/fetch-interaction-model.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |