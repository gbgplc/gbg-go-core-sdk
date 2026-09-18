# ValidationCheck

## Example Usage

```typescript
import { ValidationCheck } from "@gbg/go-core/models";

let value: ValidationCheck = {
  name: "<value>",
  title: "<value>",
  validationResult: "<value>",
  weight: "<value>",
  type: "<value>",
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `name`                                                                                       | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `title`                                                                                      | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `validationResult`                                                                           | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `weight`                                                                                     | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `regionOfInterests`                                                                          | [models.ValidationCheckRegionOfInterest](../models/validation-check-region-of-interest.md)[] | :heavy_minus_sign:                                                                           | N/A                                                                                          |
| `type`                                                                                       | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |