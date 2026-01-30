# GetJourneyStateDocumentIdNumber

## Example Usage

```typescript
import { GetJourneyStateDocumentIdNumber } from "@gbg/go-core/models/operations";

let value: GetJourneyStateDocumentIdNumber = {
  type: "<value>",
  idNumber: "<value>",
};
```

## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `type`                                                                      | *string*                                                                    | :heavy_check_mark:                                                          | The type of phone number, such as landline, mobile, fax, unknown etc        |
| `idNumber`                                                                  | *string*                                                                    | :heavy_check_mark:                                                          | ID number eg, National Insurance Number in UK, Social Securtiy Number in US |
| `country`                                                                   | *string*                                                                    | :heavy_minus_sign:                                                          | Country the address is in. It must be a valid ISO2 or ISO3 country code     |