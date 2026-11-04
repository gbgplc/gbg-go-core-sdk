# OAuthErrorResponse

## Example Usage

```typescript
import { OAuthErrorResponse } from "@gbg/go-core/models/errors";

// No examples available for this model
```

## Fields

| Field                                                                                                                                  | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `error`                                                                                                                                | *string*                                                                                                                               | :heavy_check_mark:                                                                                                                     | OAuth 2.0 error code, e.g. invalid_request, invalid_client, invalid_grant, unauthorized_client, unsupported_grant_type, invalid_scope. |
| `errorDescription`                                                                                                                     | *string*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | Human-readable detail. Not always present.                                                                                             |