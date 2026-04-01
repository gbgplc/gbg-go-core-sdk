# GetJourneyStateResponse

Success

## Example Usage

```typescript
import { GetJourneyStateResponse } from "@gbg/go-core/models/operations";

let value: GetJourneyStateResponse = {
  instanceId: "<id>",
  status: "InProgress",
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `instanceId`                                                                              | *string*                                                                                  | :heavy_check_mark:                                                                        | Journey Instance Id, a unique identifier for a started journey instance.                  |
| `status`                                                                                  | [operations.GetJourneyStateStatus](../../models/operations/get-journey-state-status.md)   | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `metaData`                                                                                | [operations.MetaData](../../models/operations/meta-data.md)                               | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `context`                                                                                 | [operations.GetJourneyStateContext](../../models/operations/get-journey-state-context.md) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `data`                                                                                    | Record<string, *any*>                                                                     | :heavy_minus_sign:                                                                        | N/A                                                                                       |