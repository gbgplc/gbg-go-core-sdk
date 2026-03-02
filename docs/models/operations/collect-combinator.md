# CollectCombinator

## Example Usage

```typescript
import { CollectCombinator } from "@gbg/go-core/models/operations";

let value: CollectCombinator = "oneOf";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"oneOf" | "allOf" | Unrecognized<string>
```