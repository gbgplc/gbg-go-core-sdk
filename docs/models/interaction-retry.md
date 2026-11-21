# InteractionRetry

## Example Usage

```typescript
import { InteractionRetry } from "@gbg/go-core/models";

let value: InteractionRetry = {
  attempt: 919121,
  maxAttempts: 780795,
  message: {
    default: "<value>",
  },
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `attempt`                              | *number*                               | :heavy_check_mark:                     | N/A                                    |
| `maxAttempts`                          | *number*                               | :heavy_check_mark:                     | N/A                                    |
| `message`                              | [models.Message](../models/message.md) | :heavy_check_mark:                     | N/A                                    |
| `reasonId`                             | *string*                               | :heavy_minus_sign:                     | N/A                                    |