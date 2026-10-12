# SearchAddressesRequest

## Example Usage

```typescript
import { SearchAddressesRequest } from "@gbg/go-core/models/operations";

let value: SearchAddressesRequest = {
  instanceId: "<id>",
  text: "<value>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `text`                                                                   | *string*                                                                 | :heavy_check_mark:                                                       | N/A                                                                      |
| `containerId`                                                            | *string*                                                                 | :heavy_minus_sign:                                                       | N/A                                                                      |
| `limit`                                                                  | *number*                                                                 | :heavy_minus_sign:                                                       | N/A                                                                      |