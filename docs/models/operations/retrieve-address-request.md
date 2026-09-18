# RetrieveAddressRequest

## Example Usage

```typescript
import { RetrieveAddressRequest } from "@gbg/go-core/models/operations";

let value: RetrieveAddressRequest = {
  instanceId: "<id>",
  addressId: "<id>",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `instanceId`                                                             | *string*                                                                 | :heavy_check_mark:                                                       | Journey Instance Id, a unique identifier for a started journey instance. |
| `addressId`                                                              | *string*                                                                 | :heavy_check_mark:                                                       | N/A                                                                      |