# ResponseBody1

## Example Usage

```typescript
import { ResponseBody1 } from "@gbg/go-core/models/operations";

let value: ResponseBody1 = {
  instanceId: "<id>",
  interactionId: "<id>",
  journey: {
    status: "Completed",
  },
  interaction: {
    collects: [
      {
        ref: "<value>",
        spec: "optional",
      },
    ],
    consumes: [
      {
        ref: "<value>",
        spec: "optional",
      },
    ],
    grId: "<id>",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `instanceId`                                                                               | *string*                                                                                   | :heavy_check_mark:                                                                         | Journey instance identifier                                                                |
| `interactionId`                                                                            | *string*                                                                                   | :heavy_check_mark:                                                                         | Interaction identifier                                                                     |
| `journey`                                                                                  | [operations.Journey1](../../models/operations/journey1.md)                                 | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `interaction`                                                                              | [operations.Interaction](../../models/operations/interaction.md)                           | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `context`                                                                                  | [operations.FetchInteractionContext](../../models/operations/fetch-interaction-context.md) | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `instructions`                                                                             | *string*[]                                                                                 | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `outstanding`                                                                              | *string*[]                                                                                 | :heavy_minus_sign:                                                                         | N/A                                                                                        |