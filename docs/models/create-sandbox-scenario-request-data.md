# CreateSandboxScenarioRequestData

Scenario payload (ScenarioPayload). Requires `modules`; optionally `defaultOutcome`, `description`, and extra passthrough fields. Validated by the store against the same schema the sandbox runtime enforces, so an accepted document is guaranteed runnable.

## Example Usage

```typescript
import { CreateSandboxScenarioRequestData } from "@gbg/go-core/models";

let value: CreateSandboxScenarioRequestData = {};
```

## Fields

| Field       | Type        | Required    | Description |
| ----------- | ----------- | ----------- | ----------- |