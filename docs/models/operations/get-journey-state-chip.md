# GetJourneyStateChip

## Example Usage

```typescript
import { GetJourneyStateChip } from "@gbg/go-core/models/operations";

let value: GetJourneyStateChip = {
  lds: [
    {
      name: "DG14",
      data: "<value>",
    },
  ],
  auth: [],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `lds`                                                                                          | [operations.GetJourneyStateLd](../../models/operations/get-journey-state-ld.md)[]              | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `auth`                                                                                         | [operations.GetJourneyStateChipAuth](../../models/operations/get-journey-state-chip-auth.md)[] | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `additionalProperties`                                                                         | Record<string, *any*>                                                                          | :heavy_minus_sign:                                                                             | N/A                                                                                            |