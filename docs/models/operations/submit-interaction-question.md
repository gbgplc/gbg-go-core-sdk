# SubmitInteractionQuestion

## Example Usage

```typescript
import { SubmitInteractionQuestion } from "@gbg/go-core/models/operations";

let value: SubmitInteractionQuestion = {
  id: 438873,
  questionText: "<value>",
  choices: [],
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `id`                                                                                         | *number*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `questionText`                                                                               | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `helpText`                                                                                   | *string*                                                                                     | :heavy_minus_sign:                                                                           | N/A                                                                                          |
| `choices`                                                                                    | [operations.SubmitInteractionChoice](../../models/operations/submit-interaction-choice.md)[] | :heavy_check_mark:                                                                           | N/A                                                                                          |