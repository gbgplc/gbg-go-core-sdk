# GetJourneyStateAccount

## Example Usage

```typescript
import { GetJourneyStateAccount } from "@gbg/go-core/models/operations";

let value: GetJourneyStateAccount = {
  type: "<value>",
  accountNumber: "<value>",
};
```

## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `type`                                                                  | *string*                                                                | :heavy_check_mark:                                                      | The type of account, e.g. Bank Account, Building Society                |
| `accountNumber`                                                         | *string*                                                                | :heavy_check_mark:                                                      | Account number                                                          |
| `sortCode`                                                              | *string*                                                                | :heavy_minus_sign:                                                      | UK sort code                                                            |
| `routingNumber`                                                         | *string*                                                                | :heavy_minus_sign:                                                      | US ABA routing number                                                   |
| `iban`                                                                  | *string*                                                                | :heavy_minus_sign:                                                      | International Bank Account Number                                       |
| `bic`                                                                   | *string*                                                                | :heavy_minus_sign:                                                      | BIC/SWIFT code                                                          |
| `accountHolderName`                                                     | *string*                                                                | :heavy_minus_sign:                                                      | Name on the account                                                     |
| `bankName`                                                              | *string*                                                                | :heavy_minus_sign:                                                      | Name of the financial institution                                       |
| `country`                                                               | *string*                                                                | :heavy_minus_sign:                                                      | Country the address is in. It must be a valid ISO2 or ISO3 country code |
| `accountType`                                                           | *string*                                                                | :heavy_minus_sign:                                                      | Account classification, e.g. current, savings                           |