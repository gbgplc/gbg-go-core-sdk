# SlimModuleStepError

## Example Usage

```typescript
import { SlimModuleStepError } from "@gbg/go-core/models";

let value: SlimModuleStepError = {
  code: "<value>",
  name: "<value>",
  problem: "<value>",
  action: "<value>",
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `code`                                                                             | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `name`                                                                             | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `problem`                                                                          | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `action`                                                                           | *string*                                                                           | :heavy_check_mark:                                                                 | N/A                                                                                |
| `location`                                                                         | [models.SlimModuleStepErrorLocation](../models/slim-module-step-error-location.md) | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `cause`                                                                            | [models.Cause](../models/cause.md)                                                 | :heavy_minus_sign:                                                                 | N/A                                                                                |