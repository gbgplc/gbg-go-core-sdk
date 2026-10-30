# SlimStep

## Example Usage

```typescript
import { SlimStep } from "@gbg/go-core/models";

let value: SlimStep = {
  nodeId: "<id>",
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `nodeId`                                                                                 | *string*                                                                                 | :heavy_check_mark:                                                                       | N/A                                                                                      |
| `name`                                                                                   | *string*                                                                                 | :heavy_minus_sign:                                                                       | N/A                                                                                      |
| `outcome`                                                                                | *string*                                                                                 | :heavy_minus_sign:                                                                       | N/A                                                                                      |
| `outcomeClassification`                                                                  | [models.SlimStepOutcomeClassification](../models/slim-step-outcome-classification.md)    | :heavy_minus_sign:                                                                       | N/A                                                                                      |
| `status`                                                                                 | [models.SlimStepStatus](../models/slim-step-status.md)                                   | :heavy_minus_sign:                                                                       | Present only when this module step failed. The journey may still have continued past it. |
| `error`                                                                                  | [models.SlimModuleStepError](../models/slim-module-step-error.md)                        | :heavy_minus_sign:                                                                       | N/A                                                                                      |