# SlimVerifiedData

Verified-output slice (OQ-A). May be transiently ABSENT on a journey already reporting `status: complete`: the certified view materializes just after the completion signal, so a client reading `data` the instant it sees `complete` may need to re-poll once. Absent `data` means "not yet available", not "no verified data". (Read-after-write closure tracked in GGO-16738.)


## Fields

| Field                                                       | Setter Type                                                 | Getter Type                                                 | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `identity`                                                  | @Nullable [SlimIdentity](../models/SlimIdentity.md)         | Optional\<[SlimIdentity](../models/SlimIdentity.md)>        | :heavy_minus_sign:                                          | N/A                                                         |
| `documents`                                                 | @Nullable List\<[SlimDocument](../models/SlimDocument.md)>  | Optional\<List\<[SlimDocument](../models/SlimDocument.md)>> | :heavy_minus_sign:                                          | N/A                                                         |