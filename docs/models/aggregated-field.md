# AggregatedField

## Example Usage

```typescript
import { AggregatedField } from "@gbg/go-core/models";

let value: AggregatedField = {
  label: "<value>",
  value: "<value>",
  source: "<value>",
  isNonLatin: false,
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `label`                                                                                    | *string*                                                                                   | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `value`                                                                                    | *string*                                                                                   | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `source`                                                                                   | *string*                                                                                   | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `isNonLatin`                                                                               | *boolean*                                                                                  | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `regionOfInterest`                                                                         | [models.AggregatedFieldRegionOfInterest](../models/aggregated-field-region-of-interest.md) | :heavy_minus_sign:                                                                         | N/A                                                                                        |