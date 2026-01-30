# StartJourneyChip

## Example Usage

```typescript
import { StartJourneyChip } from "@gbg/go-core/models/operations";

let value: StartJourneyChip = {
  lds: [],
  auth: [],
};
```

## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `lds`                                                                                   | [operations.StartJourneyLd](../../models/operations/start-journey-ld.md)[]              | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `auth`                                                                                  | [operations.StartJourneyChipAuth](../../models/operations/start-journey-chip-auth.md)[] | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `additionalProperties`                                                                  | Record<string, *any*>                                                                   | :heavy_minus_sign:                                                                      | N/A                                                                                     |