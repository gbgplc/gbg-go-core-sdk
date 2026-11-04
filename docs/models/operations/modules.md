# Modules

## Example Usage

```typescript
import { Modules } from "@gbg/go-core/models/operations";

let value: Modules = {
  outcome: "<value>",
};
```

## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `outcome`                                                               | *string*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `advice`                                                                | Record<string, *any*>                                                   | :heavy_minus_sign:                                                      | N/A                                                                     |
| `subject`                                                               | [operations.ModulesSubject](../../models/operations/modules-subject.md) | :heavy_minus_sign:                                                      | Domain-element values this module override returns in result.subject.   |
| `additionalProperties`                                                  | Record<string, *any*>                                                   | :heavy_minus_sign:                                                      | N/A                                                                     |