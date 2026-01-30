# SubmitInteractionChip

## Example Usage

```typescript
import { SubmitInteractionChip } from "@gbg/go-core/models/operations";

let value: SubmitInteractionChip = {
  lds: [],
  auth: [],
};
```

## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `lds`                                                                                             | [operations.SubmitInteractionLd](../../models/operations/submit-interaction-ld.md)[]              | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `auth`                                                                                            | [operations.SubmitInteractionChipAuth](../../models/operations/submit-interaction-chip-auth.md)[] | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `additionalProperties`                                                                            | Record<string, *any*>                                                                             | :heavy_minus_sign:                                                                                | N/A                                                                                               |