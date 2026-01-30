# GetJourneyStateDocumentEmail

## Example Usage

```typescript
import { GetJourneyStateDocumentEmail } from "@gbg/go-core/models/operations";

let value: GetJourneyStateDocumentEmail = {
  type: "<value>",
  email: "Curt54@yahoo.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |