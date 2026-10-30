# Scenario

## Example Usage

```typescript
import { Scenario } from "@gbg/go-core/models/operations";

let value: Scenario = {
  modules: {},
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `modules`                                                                      | Record<string, [operations.Modules](../../models/operations/modules.md)>       | :heavy_check_mark:                                                             | N/A                                                                            |
| `defaultOutcome`                                                               | *string*                                                                       | :heavy_minus_sign:                                                             | N/A                                                                            |
| `defaultAdvice`                                                                | Record<string, *any*>                                                          | :heavy_minus_sign:                                                             | N/A                                                                            |
| `defaultSubject`                                                               | [operations.DefaultSubject](../../models/operations/default-subject.md)        | :heavy_minus_sign:                                                             | Fallback subject values applied when a module entry has no subject of its own. |
| `description`                                                                  | *string*                                                                       | :heavy_minus_sign:                                                             | N/A                                                                            |
| `additionalProperties`                                                         | Record<string, *any*>                                                          | :heavy_minus_sign:                                                             | N/A                                                                            |