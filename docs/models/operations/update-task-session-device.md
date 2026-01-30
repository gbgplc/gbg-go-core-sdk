# UpdateTaskSessionDevice

## Example Usage

```typescript
import { UpdateTaskSessionDevice } from "@gbg/go-core/models/operations";

let value: UpdateTaskSessionDevice = {
  id: "<id>",
  manufacturer: "Volvo",
  model: {
    identifier: "<value>",
    name: "<value>",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `id`                                                                       | *string*                                                                   | :heavy_check_mark:                                                         | N/A                                                                        |
| `manufacturer`                                                             | *string*                                                                   | :heavy_check_mark:                                                         | N/A                                                                        |
| `model`                                                                    | [operations.UpdateTaskModel](../../models/operations/update-task-model.md) | :heavy_check_mark:                                                         | N/A                                                                        |