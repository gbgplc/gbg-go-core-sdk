# Detail

## Example Usage

```typescript
import { Detail } from "@gbg/go-core/models";

let value: Detail = {
  label: "<value>",
  value: "<value>",
  source: "<value>",
  isNonLatin: true,
};
```

## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `label`                                                                 | *string*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `value`                                                                 | *string*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `source`                                                                | *string*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `isNonLatin`                                                            | *boolean*                                                               | :heavy_check_mark:                                                      | N/A                                                                     |
| `regionOfInterest`                                                      | [models.DetailRegionOfInterest](../models/detail-region-of-interest.md) | :heavy_minus_sign:                                                      | N/A                                                                     |