# StartJourneyContext

## Example Usage

```typescript
import { StartJourneyContext } from "@gbg/go-core/models/operations";

let value: StartJourneyContext = {
  config: {
    delivery: "<value>",
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `subject`                                                                          | [operations.StartJourneySubject](../../models/operations/start-journey-subject.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `config`                                                                           | [operations.Config](../../models/operations/config.md)                             | :heavy_check_mark:                                                                 | N/A                                                                                |
| `additionalProperties`                                                             | Record<string, *any*>                                                              | :heavy_minus_sign:                                                                 | N/A                                                                                |