# StartJourneyKba

## Example Usage

```typescript
import { StartJourneyKba } from "@gbg/go-core/models/operations";

let value: StartJourneyKba = {
  questions: [],
  answers: [
    {
      id: 406644,
      choices: [],
    },
  ],
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `questions`                                                                            | [operations.StartJourneyQuestion](../../models/operations/start-journey-question.md)[] | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `answers`                                                                              | [operations.StartJourneyAnswer](../../models/operations/start-journey-answer.md)[]     | :heavy_check_mark:                                                                     | N/A                                                                                    |