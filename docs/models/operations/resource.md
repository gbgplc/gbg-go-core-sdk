# Resource

## Example Usage

```typescript
import { Resource } from "@gbg/go-core/models/operations";

let value: Resource = {
  id: "<id>",
  name: "<value>",
};
```

## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `id`                                                                | *string*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `name`                                                              | *string*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `hash`                                                              | *string*                                                            | :heavy_minus_sign:                                                  | N/A                                                                 |
| `version`                                                           | *string*                                                            | :heavy_minus_sign:                                                  | N/A                                                                 |
| `type`                                                              | [operations.ResourceType](../../models/operations/resource-type.md) | :heavy_minus_sign:                                                  | N/A                                                                 |
| `data`                                                              | [operations.Data](../../models/operations/data.md)                  | :heavy_minus_sign:                                                  | N/A                                                                 |