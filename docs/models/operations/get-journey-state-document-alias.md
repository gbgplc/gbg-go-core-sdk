# GetJourneyStateDocumentAlias

## Example Usage

```typescript
import { GetJourneyStateDocumentAlias } from "@gbg/go-core/models/operations";

let value: GetJourneyStateDocumentAlias = {};
```

## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `title`                                                             | *string*                                                            | :heavy_minus_sign:                                                  | Title of an individual such as Mr, Mrs, Dr, Sir                     |
| `firstName`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | A person's name used by their collegues and friends to address them |
| `middleNames`                                                       | *string*[]                                                          | :heavy_minus_sign:                                                  | Any other registered names used by the individual, not aliases      |
| `lastNames`                                                         | *string*[]                                                          | :heavy_minus_sign:                                                  | Any family names for the individual                                 |
| `lastNamesAtBirth`                                                  | *string*[]                                                          | :heavy_minus_sign:                                                  | Any family names for the individual                                 |