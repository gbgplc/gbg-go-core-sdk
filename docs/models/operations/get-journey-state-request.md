# GetJourneyStateRequest

## Example Usage

```typescript
import { GetJourneyStateRequest } from "@gbg/go-core/models/operations";

let value: GetJourneyStateRequest = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `filterKeys`                                                             | *string*[]                                                               | :heavy_minus_sign:                                                       | N/A                                                                      |