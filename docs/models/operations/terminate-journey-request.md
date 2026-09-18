# TerminateJourneyRequest

## Example Usage

```typescript
import { TerminateJourneyRequest } from "@gbg/go-core/models/operations";

let value: TerminateJourneyRequest = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `reason`                                                                 | *string*                                                                 | :heavy_minus_sign:                                                       | N/A                                                                      |
| `additionalProperties`                                                   | Record<string, *any*>                                                    | :heavy_minus_sign:                                                       | N/A                                                                      |