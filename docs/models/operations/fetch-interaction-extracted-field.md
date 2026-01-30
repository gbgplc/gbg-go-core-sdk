# FetchInteractionExtractedField

## Example Usage

```typescript
import { FetchInteractionExtractedField } from "@gbg/go-core/models/operations";

let value: FetchInteractionExtractedField = {
  label: "<value>",
  details: [
    {
      label: "<value>",
      value: "<value>",
      source: "<value>",
      isNonLatin: true,
    },
  ],
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `label`                                                                                    | *string*                                                                                   | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `details`                                                                                  | [operations.FetchInteractionDetail](../../models/operations/fetch-interaction-detail.md)[] | :heavy_check_mark:                                                                         | N/A                                                                                        |