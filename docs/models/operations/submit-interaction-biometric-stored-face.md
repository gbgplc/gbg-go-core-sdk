# SubmitInteractionBiometricStoredFace

## Example Usage

```typescript
import { SubmitInteractionBiometricStoredFace } from "@gbg/go-core/models/operations";

let value: SubmitInteractionBiometricStoredFace = {
  type: "storedFace",
  templateReference: "<value>",
};
```

## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                      | *string*                                                                                                  | :heavy_minus_sign:                                                                                        | N/A                                                                                                       |
| `type`                                                                                                    | [operations.SubmitInteractionBiometricType](../../models/operations/submit-interaction-biometric-type.md) | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `templateReference`                                                                                       | *string*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |