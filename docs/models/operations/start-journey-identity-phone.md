# StartJourneyIdentityPhone

## Example Usage

```typescript
import { StartJourneyIdentityPhone } from "@gbg/go-core/models/operations";

let value: StartJourneyIdentityPhone = {
  type: "<value>",
  number: "<value>",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `type`                                                               | *string*                                                             | :heavy_check_mark:                                                   | The type of phone number, such as landline, mobile, fax, unknown etc |
| `number`                                                             | *string*                                                             | :heavy_check_mark:                                                   | Phone number, ideally in international format with +(Country Code)   |