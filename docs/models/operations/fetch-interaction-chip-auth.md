# FetchInteractionChipAuth

## Example Usage

```typescript
import { FetchInteractionChipAuth } from "@gbg/go-core/models/operations";

let value: FetchInteractionChipAuth = {
  type: "BasicAccessControl",
  result: "Success",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | [operations.FetchInteractionAuthType](../../models/operations/fetch-interaction-auth-type.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `result`                                                                                      | [operations.FetchInteractionResult](../../models/operations/fetch-interaction-result.md)      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `additionalProperties`                                                                        | Record<string, *any*>                                                                         | :heavy_minus_sign:                                                                            | N/A                                                                                           |