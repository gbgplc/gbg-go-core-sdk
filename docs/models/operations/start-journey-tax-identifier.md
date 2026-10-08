# StartJourneyTaxIdentifier

## Example Usage

```typescript
import { StartJourneyTaxIdentifier } from "@gbg/go-core/models/operations";

let value: StartJourneyTaxIdentifier = {
  type: "EIN",
  value: "<value>",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                   | [operations.StartJourneyTaxIdentifierType](../../models/operations/start-journey-tax-identifier-type.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
| `value`                                                                                                  | *string*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
| `country`                                                                                                | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Country the address is in. It must be a valid ISO2 or ISO3 country code                                  |