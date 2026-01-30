# SubmitInteractionSubject

## Example Usage

```typescript
import { SubmitInteractionSubject } from "@gbg/go-core/models/operations";

let value: SubmitInteractionSubject = {};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `identity`                                                                                       | [operations.SubmitInteractionIdentity](../../models/operations/submit-interaction-identity.md)   | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `documents`                                                                                      | [operations.SubmitInteractionDocument](../../models/operations/submit-interaction-document.md)[] | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `biometrics`                                                                                     | *operations.SubmitInteractionBiometricUnion*[]                                                   | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `sessions`                                                                                       | [operations.SubmitInteractionSession](../../models/operations/submit-interaction-session.md)[]   | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `consent`                                                                                        | [operations.SubmitInteractionConsent](../../models/operations/submit-interaction-consent.md)[]   | :heavy_minus_sign:                                                                               | N/A                                                                                              |
| `uid`                                                                                            | *string*                                                                                         | :heavy_minus_sign:                                                                               | N/A                                                                                              |