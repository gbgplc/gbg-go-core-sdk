# GetTaskSchemaResponse

Success

## Example Usage

```typescript
import { GetTaskSchemaResponse } from "@gbg/go-core/models/operations";

let value: GetTaskSchemaResponse = {
  dollarSchema: "<value>",
  type: "<value>",
  properties: {
    "key": "<value>",
    "key1": "<value>",
    "key2": "<value>",
  },
  required: [
    "<value 1>",
    "<value 2>",
    "<value 3>",
  ],
};
```

## Fields

| Field                 | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `dollarSchema`        | *string*              | :heavy_check_mark:    | N/A                   |
| `type`                | *string*              | :heavy_check_mark:    | N/A                   |
| `properties`          | Record<string, *any*> | :heavy_check_mark:    | N/A                   |
| `required`            | *string*[]            | :heavy_check_mark:    | N/A                   |