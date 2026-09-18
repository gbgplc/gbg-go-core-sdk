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

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `id`                                                                                            | *string*                                                                                        | :heavy_minus_sign:                                                                              | N/A                                                                                             |
| `type`                                                                                          | [operations.StartJourneyBiometricType](../../models/operations/start-journey-biometric-type.md) | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `templateReference`                                                                             | *string*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             |