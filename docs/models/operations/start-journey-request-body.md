# StartJourneyRequestBody

## Example Usage

```typescript
import { StartJourneyRequestBody } from "@gbg/go-core/models/operations";

let value: StartJourneyRequestBody = {
  resourceId: "<id>",
  context: {
    config: {
      delivery: "<value>",
    },
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `resourceId`                                                                       | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `context`                                                                          | [operations.StartJourneyContext](../../models/operations/start-journey-context.md) | :heavy_check_mark:                                                                 | N/A                                                                                |
| `scenario`                                                                         | [operations.Scenario](../../models/operations/scenario.md)                         | :heavy_minus_sign:                                                                 | N/A                                                                                |