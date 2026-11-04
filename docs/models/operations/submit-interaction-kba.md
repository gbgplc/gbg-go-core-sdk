# SubmitInteractionKba

## Example Usage

```typescript
import { SubmitInteractionKba } from "@gbg/go-core/models/operations";

let value: SubmitInteractionKba = {
  questions: [
    {
      id: 130741,
      questionText: "<value>",
      choices: [],
    },
  ],
  answers: [],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `questions`                                                                                      | [operations.SubmitInteractionQuestion](../../models/operations/submit-interaction-question.md)[] | :heavy_check_mark:                                                                               | N/A                                                                                              |
| `answers`                                                                                        | [operations.SubmitInteractionAnswer](../../models/operations/submit-interaction-answer.md)[]     | :heavy_check_mark:                                                                               | N/A                                                                                              |