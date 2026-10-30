# ManualReview

Reviewer-supplied manual-review input: a required decision ordinal plus optional notes. Identity fields are Captain-populated and rejected here.

## Example Usage

```typescript
import { ManualReview } from "@gbg/go-core/models/operations";

let value: ManualReview = {
  decision: 147652,
};
```

## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `decision`                                                | *number*                                                  | :heavy_check_mark:                                        | Ordinal decision outcome (0-9) submitted by the reviewer  |
| `notes`                                                   | *string*                                                  | :heavy_minus_sign:                                        | Free-text justification or notes provided by the reviewer |