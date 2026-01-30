# SubmitInteractionChipAuth

## Example Usage

```typescript
import { SubmitInteractionChipAuth } from "@gbg/go-core/models/operations";

let value: SubmitInteractionChipAuth = {
  type: "SupplementalAccessControl",
  result: "Success",
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `type`                                                                                          | [operations.SubmitInteractionAuthType](../../models/operations/submit-interaction-auth-type.md) | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `result`                                                                                        | [operations.SubmitInteractionResult](../../models/operations/submit-interaction-result.md)      | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `additionalProperties`                                                                          | Record<string, *any*>                                                                           | :heavy_minus_sign:                                                                              | N/A                                                                                             |