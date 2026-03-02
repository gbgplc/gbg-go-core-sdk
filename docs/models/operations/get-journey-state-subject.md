# GetJourneyStateSubject

## Example Usage

```typescript
import { GetJourneyStateSubject } from "@gbg/go-core/models/operations";

let value: GetJourneyStateSubject = {};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `identity`                                                                                    | [operations.GetJourneyStateIdentity](../../models/operations/get-journey-state-identity.md)   | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `documents`                                                                                   | [operations.GetJourneyStateDocument](../../models/operations/get-journey-state-document.md)[] | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `biometrics`                                                                                  | *operations.GetJourneyStateBiometricUnion*[]                                                  | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `sessions`                                                                                    | [operations.GetJourneyStateSession](../../models/operations/get-journey-state-session.md)[]   | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `consent`                                                                                     | [operations.GetJourneyStateConsent](../../models/operations/get-journey-state-consent.md)[]   | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `accounts`                                                                                    | [operations.GetJourneyStateAccount](../../models/operations/get-journey-state-account.md)[]   | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `uid`                                                                                         | *string*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |