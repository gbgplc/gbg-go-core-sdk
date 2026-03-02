# Config

## Example Usage

```typescript
import { Config } from "@gbg/go-core/models/operations";

let value: Config = {
  delivery: "api",
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `delivery`                                                 | [operations.Delivery](../../models/operations/delivery.md) | :heavy_check_mark:                                         | The method by which the End User will consume the journey. |