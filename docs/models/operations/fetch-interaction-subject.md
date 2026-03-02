# FetchInteractionSubject

## Example Usage

```typescript
import { FetchInteractionSubject } from "@gbg/go-core/models/operations";

let value: FetchInteractionSubject = {};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `identity`                                                                                     | [operations.FetchInteractionIdentity](../../models/operations/fetch-interaction-identity.md)   | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `documents`                                                                                    | [operations.FetchInteractionDocument](../../models/operations/fetch-interaction-document.md)[] | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `biometrics`                                                                                   | *operations.FetchInteractionBiometricUnion*[]                                                  | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `sessions`                                                                                     | [operations.FetchInteractionSession](../../models/operations/fetch-interaction-session.md)[]   | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `consent`                                                                                      | [operations.FetchInteractionConsent](../../models/operations/fetch-interaction-consent.md)[]   | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `accounts`                                                                                     | [operations.FetchInteractionAccount](../../models/operations/fetch-interaction-account.md)[]   | :heavy_minus_sign:                                                                             | N/A                                                                                            |
| `uid`                                                                                          | *string*                                                                                       | :heavy_minus_sign:                                                                             | N/A                                                                                            |