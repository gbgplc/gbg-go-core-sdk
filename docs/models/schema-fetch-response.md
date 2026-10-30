# SchemaFetchResponse

## Example Usage

```typescript
import { SchemaFetchResponse } from "@gbg/go-core/models";

let value: SchemaFetchResponse = {
  deliveryId: "<id>",
  resolvedVersion: "<value>",
  schemas: [
    {
      interactionId: "<id>",
      schema: {},
    },
  ],
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `deliveryId`                           | *string*                               | :heavy_check_mark:                     | N/A                                    |
| `resolvedVersion`                      | *string*                               | :heavy_check_mark:                     | N/A                                    |
| `schemas`                              | [models.Schema](../models/schema.md)[] | :heavy_check_mark:                     | N/A                                    |