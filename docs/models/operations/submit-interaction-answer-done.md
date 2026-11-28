# SubmitInteractionAnswerDone

## Example Usage

```typescript
import { SubmitInteractionAnswerDone } from "@gbg/go-core/models/operations";

let value: SubmitInteractionAnswerDone = {
  status: "done",
  results: {},
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `status`                                                                                                     | *"done"*                                                                                                     | :heavy_check_mark:                                                                                           | N/A                                                                                                          |
| `results`                                                                                                    | Record<string, [operations.SubmitInteractionResults](../../models/operations/submit-interaction-results.md)> | :heavy_check_mark:                                                                                           | N/A                                                                                                          |