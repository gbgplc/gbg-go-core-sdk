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
| `instanceId`                                                                                 | *string*                                                                                     | :heavy_check_mark:                                                                           | Journey Instance Id, a unique identifier for a started journey instance.                     |
| `interactionId`                                                                              | *string*                                                                                     | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `participants`                                                                               | [operations.Participant](../../models/operations/participant.md)[]                           | :heavy_minus_sign:                                                                           | N/A                                                                                          |
| `context`                                                                                    | [operations.SubmitInteractionContext](../../models/operations/submit-interaction-context.md) | :heavy_minus_sign:                                                                           | N/A                                                                                          |
| `additionalProperties`                                                                       | Record<string, *any*>                                                                        | :heavy_minus_sign:                                                                           | N/A                                                                                          |