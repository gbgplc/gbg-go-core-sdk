# StartJourneyResponseBody1

Start Response contains the Journey Instance Id

## Example Usage

```typescript
import { StartJourneyResponseBody1 } from "@gbg/go-core/models/operations";

let value: StartJourneyResponseBody1 = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `instanceUrl`                                                            | *string*                                                                 | :heavy_minus_sign:                                                       | URL to access the journey UI for no code journey implementations.        |
| `additionalProperties`                                                   | Record<string, *any*>                                                    | :heavy_minus_sign:                                                       | N/A                                                                      |