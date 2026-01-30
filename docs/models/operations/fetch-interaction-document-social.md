# FetchInteractionDocumentSocial

## Example Usage

```typescript
import { FetchInteractionDocumentSocial } from "@gbg/go-core/models/operations";

let value: FetchInteractionDocumentSocial = {
  type: "<value>",
  identity: "<value>",
};
```

## Fields

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                    | *string*                                                                                                                  | :heavy_check_mark:                                                                                                        | An agreed standardised name for the social media platform this identity relates to such as Facebook, Twitter, unknown etc |
| `identity`                                                                                                                | *string*                                                                                                                  | :heavy_check_mark:                                                                                                        | the identity used on this platform                                                                                        |