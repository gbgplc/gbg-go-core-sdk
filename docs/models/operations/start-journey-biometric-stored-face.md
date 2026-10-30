# StartJourneyBiometricStoredFace

## Example Usage

```typescript
import { StartJourneyBiometricStoredFace } from "@gbg/go-core/models/operations";

let value: StartJourneyBiometricStoredFace = {
  type: "storedFace",
  templateReference: "<value>",
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `id`                                                                                               | *string*                                                                                           | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `type`                                                                                             | [operations.StartJourneyTypeStoredFace](../../models/operations/start-journey-type-stored-face.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `templateReference`                                                                                | *string*                                                                                           | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `collectionReference`                                                                              | *string*                                                                                           | :heavy_minus_sign:                                                                                 | N/A                                                                                                |