# Page

## Example Usage

```typescript
import { Page } from "@gbg/go-core/models/operations";

let value: Page = {
  id: "<id>",
  cards: [],
};
```

## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `id`                                                 | *string*                                             | :heavy_check_mark:                                   | N/A                                                  |
| `label`                                              | *string*                                             | :heavy_minus_sign:                                   | N/A                                                  |
| `cards`                                              | [operations.Card](../../models/operations/card.md)[] | :heavy_check_mark:                                   | N/A                                                  |