# SandboxScenario

## Example Usage

```typescript
import { SandboxScenario } from "@gbg/go-core/models";

let value: SandboxScenario = {
  name: "<value>",
  journeyId: "<id>",
  tier: "org",
  data: {
    "key": "<value>",
    "key1": "<value>",
    "key2": "<value>",
  },
  lastModifiedBy: "user-123",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `journeyId`                                                                                   | *string*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `tier`                                                                                        | [models.SandboxScenarioTier](../models/sandbox-scenario-tier.md)                              | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `data`                                                                                        | Record<string, *any*>                                                                         | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `lastModifiedTime`                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | When the scenario was last saved (ISO 8601).                                                  |                                                                                               |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | Principal (JWT sub) who last saved the scenario.                                              | user-123                                                                                      |