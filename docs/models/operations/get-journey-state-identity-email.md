# GetJourneyStateIdentityEmail

## Example Usage

```typescript
import { GetJourneyStateIdentityEmail } from "@gbg/go-core/models/operations";

let value: GetJourneyStateIdentityEmail = {
  type: "<value>",
  email: "Eino_Effertz78@yahoo.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |