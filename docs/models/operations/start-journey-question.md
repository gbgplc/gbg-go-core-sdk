# StartJourneyQuestion

## Example Usage

```typescript
import { StartJourneyQuestion } from "@gbg/go-core/models/operations";

let value: StartJourneyQuestion = {
  id: 823115,
  questionText: "<value>",
  choices: [],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *number*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `questionText`                                                                     | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `helpText`                                                                         | *string*                                                                           | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `choices`                                                                          | [operations.StartJourneyChoice](../../models/operations/start-journey-choice.md)[] | :heavy_check_mark:                                                                 | N/A                                                                                |