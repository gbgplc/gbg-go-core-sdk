# SubmitInteractionAnswerError1

## Example Usage

```typescript
import { SubmitInteractionAnswerError1 } from "@gbg/go-core/models/operations";

let value: SubmitInteractionAnswerError1 = {
  status: "error",
  error: {
    name: "<value>",
    message: "<value>",
  },
};
```

## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `status`                                                                                                | *"error"*                                                                                               | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `error`                                                                                                 | [operations.SubmitInteractionAnswerError2](../../models/operations/submit-interaction-answer-error2.md) | :heavy_check_mark:                                                                                      | N/A                                                                                                     |