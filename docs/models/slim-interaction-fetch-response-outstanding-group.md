# SlimInteractionFetchResponseOutstandingGroup

## Example Usage

```typescript
import { SlimInteractionFetchResponseOutstandingGroup } from "@gbg/go-core/models";

let value: SlimInteractionFetchResponseOutstandingGroup = {
  elementId: "<id>",
  cardinality: "at-least-one",
  refs: [
    "<value 1>",
    "<value 2>",
  ],
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `elementId`                                                                                                | *string*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        |
| `cardinality`                                                                                              | [models.SlimInteractionFetchResponseCardinality](../models/slim-interaction-fetch-response-cardinality.md) | :heavy_check_mark:                                                                                         | N/A                                                                                                        |
| `refs`                                                                                                     | *string*[]                                                                                                 | :heavy_check_mark:                                                                                         | N/A                                                                                                        |