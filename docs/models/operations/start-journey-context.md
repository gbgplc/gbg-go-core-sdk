# StartJourneyContext

## Example Usage

```typescript
import { StartJourneyContext } from "@gbg/go-core/models/operations";

let value: StartJourneyContext = {
  config: {
    delivery: "api",
  },
  subject: {},
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `config`                                                                           | [operations.Config](../../models/operations/config.md)                             | :heavy_check_mark:                                                                 | N/A                                                                                |
| `subject`                                                                          | [operations.StartJourneySubject](../../models/operations/start-journey-subject.md) | :heavy_check_mark:                                                                 | N/A                                                                                |