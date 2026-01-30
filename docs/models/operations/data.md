# Data

## Example Usage

```typescript
import { Data } from "@gbg/go-core/models/operations";

let value: Data = {
  pages: [
    {
      id: "<id>",
      cards: [
        {
          id: "<id>",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `pages`                                              | [operations.Page](../../models/operations/page.md)[] | :heavy_check_mark:                                   | N/A                                                  |