# GetTasksResponse

Success

## Example Usage

```typescript
import { GetTasksResponse } from "@gbg/go-core/models/operations";

let value: GetTasksResponse = {
  instanceId: "<id>",
  status: "Paused",
  tasks: [],
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `status`                                                                 | [operations.GetTasksStatus](../../models/operations/get-tasks-status.md) | :heavy_check_mark:                                                       | N/A                                                                      |
| `tasks`                                                                  | [operations.GetTasksTask](../../models/operations/get-tasks-task.md)[]   | :heavy_check_mark:                                                       | N/A                                                                      |