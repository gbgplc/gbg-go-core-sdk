# UpdateTaskSubject

## Example Usage

```typescript
import { UpdateTaskSubject } from "@gbg/go-core/models/operations";

let value: UpdateTaskSubject = {};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `identity`                                                                         | [operations.UpdateTaskIdentity](../../models/operations/update-task-identity.md)   | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `documents`                                                                        | [operations.UpdateTaskDocument](../../models/operations/update-task-document.md)[] | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `biometrics`                                                                       | *operations.UpdateTaskBiometricUnion*[]                                            | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `sessions`                                                                         | [operations.UpdateTaskSession](../../models/operations/update-task-session.md)[]   | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `consent`                                                                          | [operations.UpdateTaskConsent](../../models/operations/update-task-consent.md)[]   | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `uid`                                                                              | *string*                                                                           | :heavy_minus_sign:                                                                 | N/A                                                                                |