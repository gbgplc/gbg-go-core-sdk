# InteractionFetchResponseOutstandingGroup

## Example Usage

```typescript
import { InteractionFetchResponseOutstandingGroup } from "@gbg/go-core/models";

let value: InteractionFetchResponseOutstandingGroup = {
  elementId: "<id>",
  cardinality: "at-least-one",
  refs: [
    "<value 1>",
    "<value 2>",
    "<value 3>",
  ],
};
```

## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `elementId`                                                                                       | *string*                                                                                          | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `cardinality`                                                                                     | [models.InteractionFetchResponseCardinality](../models/interaction-fetch-response-cardinality.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `refs`                                                                                            | *string*[]                                                                                        | :heavy_check_mark:                                                                                | N/A                                                                                               |