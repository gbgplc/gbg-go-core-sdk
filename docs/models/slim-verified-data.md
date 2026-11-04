# SlimVerifiedData

Verified-output slice (OQ-A). May be transiently ABSENT on a journey already reporting `status: complete`: the certified view materializes just after the completion signal, so a client reading `data` the instant it sees `complete` may need to re-poll once. Absent `data` means "not yet available", not "no verified data". (Read-after-write closure tracked in GGO-16738.)

## Example Usage

```typescript
import { SlimVerifiedData } from "@gbg/go-core/models";

let value: SlimVerifiedData = {};
```

## Fields

| Field                                               | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `identity`                                          | [models.SlimIdentity](../models/slim-identity.md)   | :heavy_minus_sign:                                  | N/A                                                 |
| `documents`                                         | [models.SlimDocument](../models/slim-document.md)[] | :heavy_minus_sign:                                  | N/A                                                 |