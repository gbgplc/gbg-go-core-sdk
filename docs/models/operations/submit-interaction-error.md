# SubmitInteractionError

## Example Usage

```typescript
import { SubmitInteractionError } from "@gbg/go-core/models/operations";

let value: SubmitInteractionError = {
  status: "error",
  code: 4178.11,
  message: "<value>",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `status`                                | *"error"*                               | :heavy_check_mark:                      | N/A                                     |
| `code`                                  | *number*                                | :heavy_check_mark:                      | Error code indicating the type of error |
| `message`                               | *string*                                | :heavy_check_mark:                      | Error message detailing the issue       |