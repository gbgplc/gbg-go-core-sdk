# Consume2

## Example Usage

```typescript
import { Consume2 } from "@gbg/go-core/models/operations";

let value: Consume2 = {
  ref: "<value>",
  spec: "required",
  combinator: "oneOf",
  inputs: [],
};
```

## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `ref`                                                                         | *string*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           |
| `spec`                                                                        | [operations.ConsumeSpec2](../../models/operations/consume-spec2.md)           | :heavy_check_mark:                                                            | N/A                                                                           |
| `recommended`                                                                 | *boolean*                                                                     | :heavy_minus_sign:                                                            | N/A                                                                           |
| `combinator`                                                                  | [operations.ConsumeCombinator](../../models/operations/consume-combinator.md) | :heavy_check_mark:                                                            | N/A                                                                           |
| `inputs`                                                                      | [operations.ConsumeInput](../../models/operations/consume-input.md)[]         | :heavy_check_mark:                                                            | N/A                                                                           |