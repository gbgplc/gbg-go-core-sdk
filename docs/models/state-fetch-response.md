# StateFetchResponse

## Example Usage

```typescript
import { StateFetchResponse } from "@gbg/go-core/models";

let value: StateFetchResponse = {
  view: "full",
  instanceId: "<id>",
  status: "<value>",
};
```

## Fields

| Field                                     | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `view`                                    | [models.ViewEnum](../models/view-enum.md) | :heavy_check_mark:                        | N/A                                       |
| `instanceId`                              | *string*                                  | :heavy_check_mark:                        | N/A                                       |
| `status`                                  | *string*                                  | :heavy_check_mark:                        | N/A                                       |
| `context`                                 | Record<string, *any*>                     | :heavy_minus_sign:                        | N/A                                       |
| `result`                                  | Record<string, *any*>                     | :heavy_minus_sign:                        | N/A                                       |