# CreateTestScenarioRequest

## Example Usage

```typescript
import { CreateTestScenarioRequest } from "@gbg/go-core/models/operations";

let value: CreateTestScenarioRequest = {
  journeyId: "onboarding-journey",
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `journeyId`                                                                                     | *string*                                                                                        | :heavy_check_mark:                                                                              | Id of the journey the scenario belongs to. Scenarios are listed, read and resolved per journey. | onboarding-journey                                                                              |
| `body`                                                                                          | [models.CreateTestScenarioRequest](../../models/create-test-scenario-request.md)                | :heavy_minus_sign:                                                                              | N/A                                                                                             |                                                                                                 |