# SandboxScenarioSummary

## Example Usage

```typescript
import { SandboxScenarioSummary } from "@gbg/go-core/models";

let value: SandboxScenarioSummary = {
  name: "<value>",
  tier: "org",
  editable: false,
  lastModifiedBy: "user-123",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `tier`                                                                                        | [models.SandboxScenarioSummaryTier](../models/sandbox-scenario-summary-tier.md)               | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `editable`                                                                                    | *boolean*                                                                                     | :heavy_check_mark:                                                                            | N/A                                                                                           |                                                                                               |
| `description`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `lastModifiedTime`                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | When the scenario was last saved (ISO 8601).                                                  |                                                                                               |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | Principal (JWT sub) who last saved the scenario.                                              | user-123                                                                                      |