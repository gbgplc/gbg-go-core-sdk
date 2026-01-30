# UpdateTaskChipAuth

## Example Usage

```typescript
import { UpdateTaskChipAuth } from "@gbg/go-core/models/operations";

let value: UpdateTaskChipAuth = {
  type: "TerminalAuthentication",
  result: "Skipped",
};
```

## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `type`                                                                            | [operations.UpdateTaskAuthType](../../models/operations/update-task-auth-type.md) | :heavy_check_mark:                                                                | N/A                                                                               |
| `result`                                                                          | [operations.UpdateTaskResult](../../models/operations/update-task-result.md)      | :heavy_check_mark:                                                                | N/A                                                                               |
| `additionalProperties`                                                            | Record<string, *any*>                                                             | :heavy_minus_sign:                                                                | N/A                                                                               |