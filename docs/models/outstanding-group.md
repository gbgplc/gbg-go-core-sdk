# OutstandingGroup

## Example Usage

```typescript
import { OutstandingGroup } from "@gbg/go-core/models";

let value: OutstandingGroup = {
  elementId: "<id>",
  cardinality: "at-least-one",
  refs: [],
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `elementId`                                                                         | *string*                                                                            | :heavy_check_mark:                                                                  | N/A                                                                                 |                                                                                     |
| `cardinality`                                                                       | *string*                                                                            | :heavy_check_mark:                                                                  | How many of `refs` are needed. Only 'at-least-one' today; more values may be added. | at-least-one                                                                        |
| `refs`                                                                              | *string*[]                                                                          | :heavy_check_mark:                                                                  | N/A                                                                                 |                                                                                     |