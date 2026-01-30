# GetTasksSchemaTask

## Example Usage

```typescript
import { GetTasksSchemaTask } from "@gbg/go-core/models/operations";

let value: GetTasksSchemaTask = {
  taskId: "<id>",
  schema: {
    dollarRef: "<value>",
  },
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `taskId`                                                                          | *string*                                                                          | :heavy_check_mark:                                                                | Task Id, a unique identifier for a task assigned to an End User during a Journey. |
| `schema`                                                                          | [operations.Schema](../../models/operations/schema.md)                            | :heavy_check_mark:                                                                | N/A                                                                               |