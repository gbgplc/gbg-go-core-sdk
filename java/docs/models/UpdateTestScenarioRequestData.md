# UpdateTestScenarioRequestData

Scenario payload (ScenarioPayload). Requires `modules`, keyed by journey graph node id (GGO-18452 / GGO-16394); optionally `defaultOutcome`, `defaultSubject`, `description`, and extra passthrough fields. Validated by the store against the same schema the test scenario runtime enforces, so an accepted document is guaranteed runnable.


## Fields

| Field       | Setter Type | Getter Type | Required    | Description |
| ----------- | ----------- | ----------- | ----------- | ----------- |