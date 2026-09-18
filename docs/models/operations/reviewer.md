# Reviewer

Caller-facing reviewer entry for a submit request.

## Example Usage

```typescript
import { Reviewer } from "@gbg/go-core/models/operations";

let value: Reviewer = {};
```

## Fields

| Field                                                                                                                                            | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `manualReview`                                                                                                                                   | [operations.ManualReview](../../models/operations/manual-review.md)                                                                              | :heavy_minus_sign:                                                                                                                               | Reviewer-supplied manual-review input: a required decision ordinal plus optional notes. Identity fields are Captain-populated and rejected here. |