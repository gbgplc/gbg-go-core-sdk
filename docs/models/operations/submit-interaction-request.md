# SubmitInteractionRequest

## Example Usage

```typescript
import { SubmitInteractionRequest } from "@gbg/go-core/models/operations";

let value: SubmitInteractionRequest = {
  instanceId: "<id>",
  interactionId: "<id>",
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `instanceId`                                                                                 | *string*                                                                                     | :heavy_check_mark:                                                                           | Journey instance identifier                                                                  |
| `interactionId`                                                                              | *string*                                                                                     | :heavy_check_mark:                                                                           | Interaction identifier                                                                       |
| `participants`                                                                               | [operations.Participant](../../models/operations/participant.md)[]                           | :heavy_minus_sign:                                                                           | List of participant identifiers involved in the interaction                                  |
| `context`                                                                                    | [operations.SubmitInteractionContext](../../models/operations/submit-interaction-context.md) | :heavy_minus_sign:                                                                           | N/A                                                                                          |