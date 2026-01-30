# StartJourneyIdentityEmail

## Example Usage

```typescript
import { StartJourneyIdentityEmail } from "@gbg/go-core/models/operations";

let value: StartJourneyIdentityEmail = {
  type: "<value>",
  email: "Paxton_Padberg@hotmail.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |