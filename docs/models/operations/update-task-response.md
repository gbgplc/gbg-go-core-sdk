# UpdateTaskResponse

Success

## Example Usage

```typescript
import { UpdateTaskResponse } from "@gbg/go-core/models/operations";

let value: UpdateTaskResponse = {
  instanceId: "<id>",
  taskId: "<id>",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `instanceId`                                                                      | *string*                                                                          | :heavy_check_mark:                                                                | Journey Instance Id, a unique identifier for a started journey instance.          |
| `taskId`                                                                          | *string*                                                                          | :heavy_check_mark:                                                                | Task Id, a unique identifier for a task assigned to an End User during a Journey. |