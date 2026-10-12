# JourneyStartResponse

## Example Usage

```typescript
import { JourneyStartResponse } from "@gbg/go-core/models";

let value: JourneyStartResponse = {
  instanceId: "<id>",
  status: "failed",
};
```

## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `instanceId`                                                                    | *string*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `instanceUrl`                                                                   | *string*                                                                        | :heavy_minus_sign:                                                              | N/A                                                                             |
| `status`                                                                        | [models.JourneyStartResponseStatus](../models/journey-start-response-status.md) | :heavy_check_mark:                                                              | N/A                                                                             |
| `message`                                                                       | *string*                                                                        | :heavy_minus_sign:                                                              | N/A                                                                             |
| `waitedSeconds`                                                                 | *number*                                                                        | :heavy_minus_sign:                                                              | N/A                                                                             |
| `state`                                                                         | [models.StateFetchResponse](../models/state-fetch-response.md)                  | :heavy_minus_sign:                                                              | N/A                                                                             |