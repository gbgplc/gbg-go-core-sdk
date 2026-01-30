# StartJourneyIdentitySocial

## Example Usage

```typescript
import { StartJourneyIdentitySocial } from "@gbg/go-core/models/operations";

let value: StartJourneyIdentitySocial = {
  type: "<value>",
  identity: "<value>",
};
```

## Fields

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                    | *string*                                                                                                                  | :heavy_check_mark:                                                                                                        | An agreed standardised name for the social media platform this identity relates to such as Facebook, Twitter, unknown etc |
| `identity`                                                                                                                | *string*                                                                                                                  | :heavy_check_mark:                                                                                                        | the identity used on this platform                                                                                        |