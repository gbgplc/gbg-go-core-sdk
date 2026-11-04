# ExtractedField

## Example Usage

```typescript
import { ExtractedField } from "@gbg/go-core/models";

let value: ExtractedField = {
  label: "<value>",
  details: [
    {
      label: "<value>",
      value: "<value>",
      source: "<value>",
      isNonLatin: false,
    },
  ],
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `label`                                | *string*                               | :heavy_check_mark:                     | N/A                                    |
| `details`                              | [models.Detail](../models/detail.md)[] | :heavy_check_mark:                     | N/A                                    |