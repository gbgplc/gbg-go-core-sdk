# StartJourneyDocumentEmail

## Example Usage

```typescript
import { StartJourneyDocumentEmail } from "@gbg/go-core/models/operations";

let value: StartJourneyDocumentEmail = {
  type: "<value>",
  email: "Briana17@yahoo.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |