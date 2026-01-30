# FetchInteractionResult

## Example Usage

```typescript
import { FetchInteractionResult } from "@gbg/go-core/models/operations";

let value: FetchInteractionResult = "Skipped";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"Success" | "Failure" | "Skipped" | Unrecognized<string>
```