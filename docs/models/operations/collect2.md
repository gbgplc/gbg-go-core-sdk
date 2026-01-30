# Collect2

## Example Usage

```typescript
import { Collect2 } from "@gbg/go-core/models/operations";

let value: Collect2 = {
  ref: "<value>",
  spec: "required",
  combinator: "<value>",
  inputs: [
    {
      ref: "<value>",
      spec: "required",
    },
  ],
};
```

## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `ref`                                                                 | *string*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |
| `spec`                                                                | [operations.CollectSpec2](../../models/operations/collect-spec2.md)   | :heavy_check_mark:                                                    | N/A                                                                   |
| `recommended`                                                         | *boolean*                                                             | :heavy_minus_sign:                                                    | N/A                                                                   |
| `combinator`                                                          | *string*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |
| `inputs`                                                              | [operations.CollectInput](../../models/operations/collect-input.md)[] | :heavy_check_mark:                                                    | N/A                                                                   |