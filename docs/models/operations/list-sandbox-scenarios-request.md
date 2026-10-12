# ListSandboxScenariosRequest

## Example Usage

```typescript
import { ListSandboxScenariosRequest } from "@gbg/go-core/models/operations";

let value: ListSandboxScenariosRequest = {
  journeyId: "onboarding-journey",
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                          | *string*                                                                                                             | :heavy_check_mark:                                                                                                   | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                      | onboarding-journey                                                                                                   |
| `includePlatform`                                                                                                    | [operations.ListSandboxScenariosIncludePlatform](../../models/operations/list-sandbox-scenarios-include-platform.md) | :heavy_minus_sign:                                                                                                   | Include read-only platform-tier scenarios in the listing. Defaults to false.                                         |                                                                                                                      |