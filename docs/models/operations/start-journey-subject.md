# StartJourneySubject

## Example Usage

```typescript
import { StartJourneySubject } from "@gbg/go-core/models/operations";

let value: StartJourneySubject = {};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `identity`                                                                             | [operations.StartJourneyIdentity](../../models/operations/start-journey-identity.md)   | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `documents`                                                                            | [operations.StartJourneyDocument](../../models/operations/start-journey-document.md)[] | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `biometrics`                                                                           | *operations.StartJourneyBiometricUnion*[]                                              | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `sessions`                                                                             | [operations.StartJourneySession](../../models/operations/start-journey-session.md)[]   | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `consent`                                                                              | [operations.StartJourneyConsent](../../models/operations/start-journey-consent.md)[]   | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `accounts`                                                                             | [operations.StartJourneyAccount](../../models/operations/start-journey-account.md)[]   | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `uid`                                                                                  | *string*                                                                               | :heavy_minus_sign:                                                                     | N/A                                                                                    |