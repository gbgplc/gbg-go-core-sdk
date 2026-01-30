# SubmitInteractionIdentityEmail

## Example Usage

```typescript
import { SubmitInteractionIdentityEmail } from "@gbg/go-core/models/operations";

let value: SubmitInteractionIdentityEmail = {
  type: "<value>",
  email: "Lola_Turcotte@yahoo.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |