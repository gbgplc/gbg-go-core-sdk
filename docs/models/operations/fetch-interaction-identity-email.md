# FetchInteractionIdentityEmail

## Example Usage

```typescript
import { FetchInteractionIdentityEmail } from "@gbg/go-core/models/operations";

let value: FetchInteractionIdentityEmail = {
  type: "<value>",
  email: "Valentin.Hartmann86@hotmail.com",
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `type`                                             | *string*                                           | :heavy_check_mark:                                 | The type of email, such as home, work, unknown etc |
| `email`                                            | *string*                                           | :heavy_check_mark:                                 | Email address                                      |