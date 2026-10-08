# SubmitInteractionContext

## Example Usage

```typescript
import { SubmitInteractionContext } from "@gbg/go-core/models/operations";

let value: SubmitInteractionContext = {
  subject: {},
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `subject`                                                                                    | [operations.SubmitInteractionSubject](../../models/operations/submit-interaction-subject.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `reviewers`                                                                                  | [operations.Reviewer](../../models/operations/reviewer.md)[]                                 | :heavy_minus_sign:                                                                           | Reviewer decisions for this submit. Single reviewer at v1 (max 1).                           |