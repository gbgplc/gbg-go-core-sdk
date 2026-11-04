# DeleteResponse

## Example Usage

```typescript
import { DeleteResponse } from "@gbg/go-core/models";

let value: DeleteResponse = {
  instanceId: "<id>",
  status: "deleted",
  message: "<value>",
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `instanceId`                                                       | *string*                                                           | :heavy_check_mark:                                                 | N/A                                                                |
| `status`                                                           | [models.DeleteResponseStatus](../models/delete-response-status.md) | :heavy_check_mark:                                                 | N/A                                                                |
| `message`                                                          | *string*                                                           | :heavy_check_mark:                                                 | N/A                                                                |