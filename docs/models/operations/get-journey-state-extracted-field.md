# GetJourneyStateExtractedField

## Example Usage

```typescript
import { GetJourneyStateExtractedField } from "@gbg/go-core/models/operations";

let value: GetJourneyStateExtractedField = {
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

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `label`                                                                                   | *string*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `details`                                                                                 | [operations.GetJourneyStateDetail](../../models/operations/get-journey-state-detail.md)[] | :heavy_check_mark:                                                                        | N/A                                                                                       |