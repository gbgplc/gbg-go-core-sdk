# FetchInteractionError

## Example Usage

```typescript
import { FetchInteractionError } from "@gbg/go-core/models/operations";

let value: FetchInteractionError = {
  status: "error",
  code: 6719.06,
  message: "<value>",
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `status`                                                                                            | [operations.FetchInteractionStatusError](../../models/operations/fetch-interaction-status-error.md) | :heavy_check_mark:                                                                                  | N/A                                                                                                 |
| `code`                                                                                              | *number*                                                                                            | :heavy_check_mark:                                                                                  | Error code indicating the type of error                                                             |
| `message`                                                                                           | *string*                                                                                            | :heavy_check_mark:                                                                                  | Error message detailing the issue                                                                   |