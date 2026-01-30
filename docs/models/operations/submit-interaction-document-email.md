# SubmitInteractionDocumentEmail

## Example Usage

```typescript
import { SubmitInteractionDocumentEmail } from "@gbg/go-core/models/operations";

let value: SubmitInteractionDocumentEmail = {
  type: "<value>",
  email: "Antwan.McDermott35@gmail.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |