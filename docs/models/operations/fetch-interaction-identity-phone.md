# FetchInteractionIdentityPhone

## Example Usage

```typescript
import { FetchInteractionIdentityPhone } from "@gbg/go-core/models/operations";

let value: FetchInteractionIdentityPhone = {
  type: "<value>",
  number: "<value>",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `type`                                                               | *string*                                                             | :heavy_check_mark:                                                   | The type of phone number, such as landline, mobile, fax, unknown etc |
| `number`                                                             | *string*                                                             | :heavy_check_mark:                                                   | Phone number, ideally in international format with +(Country Code)   |