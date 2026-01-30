# Interaction

## Example Usage

```typescript
import { Interaction } from "@gbg/go-core/models/operations";

let value: Interaction = {
  collects: [],
  consumes: [],
  grId: "<id>",
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `resource`                                                 | [operations.Resource](../../models/operations/resource.md) | :heavy_minus_sign:                                         | N/A                                                        |
| `collects`                                                 | *operations.CollectUnion*[]                                | :heavy_check_mark:                                         | N/A                                                        |
| `consumes`                                                 | *operations.ConsumeUnion*[]                                | :heavy_check_mark:                                         | N/A                                                        |
| `grId`                                                     | *string*                                                   | :heavy_check_mark:                                         | N/A                                                        |