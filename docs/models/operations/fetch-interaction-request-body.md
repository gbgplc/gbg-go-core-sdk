# FetchInteractionRequestBody

## Example Usage

```typescript
import { FetchInteractionRequestBody } from "@gbg/go-core/models/operations";

let value: FetchInteractionRequestBody = {
  instanceId: "<id>",
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `instanceId`                                                                           | *string*                                                                               | :heavy_check_mark:                                                                     | Journey Instance Id, a unique identifier for a started journey instance.               |
| `scope`                                                                                | [operations.FetchInteractionScope](../../models/operations/fetch-interaction-scope.md) | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `additionalProperties`                                                                 | Record<string, *any*>                                                                  | :heavy_minus_sign:                                                                     | N/A                                                                                    |