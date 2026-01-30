# GetTaskSchemaRequest

## Example Usage

```typescript
import { GetTaskSchemaRequest } from "@gbg/go-core/models/operations";

let value: GetTaskSchemaRequest = {
  taskId: "<id>",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `taskId`                                                                          | *string*                                                                          | :heavy_check_mark:                                                                | Task Id, a unique identifier for a task assigned to an End User during a Journey. |