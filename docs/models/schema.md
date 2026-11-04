# Schema

## Example Usage

```typescript
import { Schema } from "@gbg/go-core/models";

let value: Schema = {
  interactionId: "<id>",
  schema: {
    "key": "<value>",
  },
};
```

## Fields

| Field                 | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `interactionId`       | *string*              | :heavy_check_mark:    | N/A                   |
| `instruction`         | *string*              | :heavy_minus_sign:    | N/A                   |
| `schema`              | Record<string, *any*> | :heavy_check_mark:    | N/A                   |