# UploadInteractionAssetResponse

Asset stored; returns the gofs key to reference in the subsequent submit

## Example Usage

```typescript
import { UploadInteractionAssetResponse } from "@gbg/go-core/models/operations";

let value: UploadInteractionAssetResponse = {
  domainElementId: "<id>",
  gofsKey: "<value>",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `domainElementId`  | *string*           | :heavy_check_mark: | N/A                |
| `gofsKey`          | *string*           | :heavy_check_mark: | N/A                |