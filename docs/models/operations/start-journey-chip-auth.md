# StartJourneyChipAuth

## Example Usage

```typescript
import { StartJourneyChipAuth } from "@gbg/go-core/models/operations";

let value: StartJourneyChipAuth = {
  type: "BasicAccessControl",
  result: "Failure",
};
```

## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `type`                                                                                | [operations.StartJourneyAuthType](../../models/operations/start-journey-auth-type.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `result`                                                                              | [operations.StartJourneyResult](../../models/operations/start-journey-result.md)      | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `additionalProperties`                                                                | Record<string, *any*>                                                                 | :heavy_minus_sign:                                                                    | N/A                                                                                   |