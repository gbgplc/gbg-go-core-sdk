# SlimInteractionFetchResponse

## Example Usage

```typescript
import { SlimInteractionFetchResponse } from "@gbg/go-core/models";

let value: SlimInteractionFetchResponse = {
  view: "slim",
  instanceId: "<id>",
  journey: {
    status: "Failed",
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

| Field                                                                                                         | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `view`                                                                                                        | *"slim"*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `instanceId`                                                                                                  | *string*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `interactionId`                                                                                               | *string*                                                                                                      | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `journey`                                                                                                     | [models.SlimInteractionFetchResponseJourney](../models/slim-interaction-fetch-response-journey.md)            | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `interaction`                                                                                                 | Record<string, *any*>                                                                                         | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `processing`                                                                                                  | *boolean*                                                                                                     | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `outstanding`                                                                                                 | *string*[]                                                                                                    | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `outstandingGroups`                                                                                           | [models.OutstandingGroup](../models/outstanding-group.md)[]                                                   | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `instructions`                                                                                                | *string*[]                                                                                                    | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `result`                                                                                                      | [models.SlimResult](../models/slim-result.md)                                                                 | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `joinedDevice`                                                                                                | [models.SlimInteractionFetchResponseJoinedDevice](../models/slim-interaction-fetch-response-joined-device.md) | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |