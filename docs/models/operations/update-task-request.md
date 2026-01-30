# UpdateTaskRequest

## Example Usage

```typescript
import { UpdateTaskRequest } from "@gbg/go-core/models/operations";

let value: UpdateTaskRequest = {
  instanceId: "<id>",
  taskId: "<id>",
  intent: "Validate",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `instanceId`                                                                      | *string*                                                                          | :heavy_check_mark:                                                                | Journey Instance Id, a unique identifier for a started journey instance.          |
| `taskId`                                                                          | *string*                                                                          | :heavy_check_mark:                                                                | Task Id, a unique identifier for a task assigned to an End User during a Journey. |
| `intent`                                                                          | [operations.Intent](../../models/operations/intent.md)                            | :heavy_check_mark:                                                                | N/A                                                                               |
| `context`                                                                         | [operations.UpdateTaskContext](../../models/operations/update-task-context.md)    | :heavy_minus_sign:                                                                | N/A                                                                               |
| `data`                                                                            | Record<string, *any*>                                                             | :heavy_minus_sign:                                                                | N/A                                                                               |