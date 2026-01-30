# GetTasksSchemaResponse

Success

## Example Usage

```typescript
import { GetTasksSchemaResponse } from "@gbg/go-core/models/operations";

let value: GetTasksSchemaResponse = {
  instanceId: "<id>",
  status: "Paused",
  tasks: [],
  schemas: {},
};
```

## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `instanceId`                                                                          | *string*                                                                              | :heavy_check_mark:                                                                    | Journey Instance Id, a unique identifier for a started journey instance.              |
| `status`                                                                              | [operations.GetTasksSchemaStatus](../../models/operations/get-tasks-schema-status.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `tasks`                                                                               | [operations.GetTasksSchemaTask](../../models/operations/get-tasks-schema-task.md)[]   | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `schemas`                                                                             | Record<string, [operations.Schemas](../../models/operations/schemas.md)>              | :heavy_check_mark:                                                                    | N/A                                                                                   |