# FetchInteractionChip

## Example Usage

```typescript
import { FetchInteractionChip } from "@gbg/go-core/models/operations";

let value: FetchInteractionChip = {
  lds: [
    {
      name: "DG1",
      data: "<value>",
    },
  ],
  auth: [],
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `lds`                                                                                           | [operations.FetchInteractionLd](../../models/operations/fetch-interaction-ld.md)[]              | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `auth`                                                                                          | [operations.FetchInteractionChipAuth](../../models/operations/fetch-interaction-chip-auth.md)[] | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `additionalProperties`                                                                          | Record<string, *any*>                                                                           | :heavy_minus_sign:                                                                              | N/A                                                                                             |