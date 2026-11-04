# PutTestScenarioRequest

## Example Usage

```typescript
import { PutTestScenarioRequest } from "@gbg/go-core/models/operations";

let value: PutTestScenarioRequest = {
  journeyId: "onboarding-journey",
  name: "my-scenario",
};
```

## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                                                       | *string*                                                                                                                          | :heavy_check_mark:                                                                                                                | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey.                                   | onboarding-journey                                                                                                                |
| `name`                                                                                                                            | *string*                                                                                                                          | :heavy_check_mark:                                                                                                                | Scenario identifier, unique per journey (GGO-18332). The same name may exist on other journeys of the org with different content. | my-scenario                                                                                                                       |
| `body`                                                                                                                            | [models.UpdateTestScenarioRequest](../../models/update-test-scenario-request.md)                                                  | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |