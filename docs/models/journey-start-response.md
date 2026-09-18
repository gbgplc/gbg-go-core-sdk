# JourneyStartResponse

## Example Usage

```typescript
import { JourneyStartResponse } from "@gbg/go-core/models";

let value: JourneyStartResponse = {
  instanceId: "<id>",
  status: "started",
};
```

## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `instanceId`                                                                    | *string*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `instanceUrl`                                                                   | *string*                                                                        | :heavy_minus_sign:                                                              | N/A                                                                             |
| `status`                                                                        | [models.JourneyStartResponseStatus](../models/journey-start-response-status.md) | :heavy_check_mark:                                                              | N/A                                                                             |
| `message`                                                                       | *string*                                                                        | :heavy_minus_sign:                                                              | N/A                                                                             |