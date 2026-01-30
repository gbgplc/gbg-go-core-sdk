# UpdateTaskChip

## Example Usage

```typescript
import { UpdateTaskChip } from "@gbg/go-core/models/operations";

let value: UpdateTaskChip = {
  lds: [],
  auth: [
    {
      type: "SupplementalAccessControl",
      result: "Skipped",
    },
  ],
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `lds`                                                                               | [operations.UpdateTaskLd](../../models/operations/update-task-ld.md)[]              | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `auth`                                                                              | [operations.UpdateTaskChipAuth](../../models/operations/update-task-chip-auth.md)[] | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `additionalProperties`                                                              | Record<string, *any*>                                                               | :heavy_minus_sign:                                                                  | N/A                                                                                 |