# GetJourneyStateChipAuth

## Example Usage

```typescript
import { GetJourneyStateChipAuth } from "@gbg/go-core/models/operations";

let value: GetJourneyStateChipAuth = {
  type: "PassiveAuthentication",
  result: "Failure",
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `type`                                                                                       | [operations.GetJourneyStateAuthType](../../models/operations/get-journey-state-auth-type.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `result`                                                                                     | [operations.GetJourneyStateResult](../../models/operations/get-journey-state-result.md)      | :heavy_check_mark:                                                                           | N/A                                                                                          |
| `additionalProperties`                                                                       | Record<string, *any*>                                                                        | :heavy_minus_sign:                                                                           | N/A                                                                                          |