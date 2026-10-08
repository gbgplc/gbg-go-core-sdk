# SlimStateFetchResponse

## Example Usage

```typescript
import { SlimStateFetchResponse } from "@gbg/go-core/models";

let value: SlimStateFetchResponse = {
  instanceId: "<id>",
  status: "Error",
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `instanceId`                                                                         | *string*                                                                             | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `status`                                                                             | [models.SlimStateFetchResponseStatus](../models/slim-state-fetch-response-status.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `journey`                                                                            | [models.SlimJourney](../models/slim-journey.md)                                      | :heavy_minus_sign:                                                                   | N/A                                                                                  |
| `steps`                                                                              | [models.SlimStep](../models/slim-step.md)[]                                          | :heavy_minus_sign:                                                                   | N/A                                                                                  |
| `result`                                                                             | [models.SlimResult](../models/slim-result.md)                                        | :heavy_minus_sign:                                                                   | N/A                                                                                  |