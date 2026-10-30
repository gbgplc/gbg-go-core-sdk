# InteractionFetchResponse

## Example Usage

```typescript
import { InteractionFetchResponse } from "@gbg/go-core/models";

let value: InteractionFetchResponse = {
  view: "full",
  instanceId: "<id>",
  journey: {
    status: "<value>",
  },
  outstandingGroups: [
    {
      elementId: "<id>",
      cardinality: "at-least-one",
      refs: [
        "<value 1>",
        "<value 2>",
        "<value 3>",
      ],
    },
  ],
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `view`                                                                                               | *"full"*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `instanceId`                                                                                         | *string*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `interactionId`                                                                                      | *string*                                                                                             | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `journey`                                                                                            | [models.InteractionFetchResponseJourney](../models/interaction-fetch-response-journey.md)            | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `interaction`                                                                                        | Record<string, *any*>                                                                                | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `context`                                                                                            | Record<string, *any*>                                                                                | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `instructions`                                                                                       | *any*                                                                                                | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `outstanding`                                                                                        | *any*                                                                                                | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `outstandingGroups`                                                                                  | [models.OutstandingGroup](../models/outstanding-group.md)[]                                          | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `processing`                                                                                         | *boolean*                                                                                            | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `result`                                                                                             | Record<string, *any*>                                                                                | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `joinedDevice`                                                                                       | [models.InteractionFetchResponseJoinedDevice](../models/interaction-fetch-response-joined-device.md) | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |