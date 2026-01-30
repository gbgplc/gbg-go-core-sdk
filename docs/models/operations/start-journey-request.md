# StartJourneyRequest

## Example Usage

```typescript
import { StartJourneyRequest } from "@gbg/go-core/models/operations";

let value: StartJourneyRequest = {
  resourceId: "<id>",
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `resourceId`                                                                       | *string*                                                                           | :heavy_check_mark:                                                                 | Resource Id, a unique identifier for a resource, such as a journey or instance.    |
| `context`                                                                          | [operations.StartJourneyContext](../../models/operations/start-journey-context.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `data`                                                                             | Record<string, *any*>                                                              | :heavy_minus_sign:                                                                 | N/A                                                                                |