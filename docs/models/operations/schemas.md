# Schemas

## Example Usage

```typescript
import { Schemas } from "@gbg/go-core/models/operations";

let value: Schemas = {
  dollarSchema: "<value>",
  type: "<value>",
  properties: {
    "key": "<value>",
  },
  required: [
    "<value 1>",
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