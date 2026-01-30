# ResponseBody

## Example Usage

```typescript
import { ResponseBody } from "@gbg/go-core/models/operations";

let value: ResponseBody = {
  instanceId: "<id>",
  interactionId: "<id>",
  journey: {
    status: "Paused",
  },
  interaction: {
    collects: [],
    consumes: [
      {
        ref: "<value>",
        spec: "required",
      },
    ],
    grId: "<id>",
  },
  context: {},
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `instanceId`                                                                               | *string*                                                                                   | :heavy_check_mark:                                                                         | Journey instance identifier                                                                |
| `interactionId`                                                                            | *string*                                                                                   | :heavy_check_mark:                                                                         | Interaction identifier                                                                     |
| `journey`                                                                                  | [operations.Journey](../../models/operations/journey.md)                                   | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `interaction`                                                                              | [operations.Interaction](../../models/operations/interaction.md)                           | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `context`                                                                                  | [operations.FetchInteractionContext](../../models/operations/fetch-interaction-context.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |
| `instructions`                                                                             | *string*[]                                                                                 | :heavy_minus_sign:                                                                         | N/A                                                                                        |
| `outstanding`                                                                              | *string*[]                                                                                 | :heavy_minus_sign:                                                                         | N/A                                                                                        |