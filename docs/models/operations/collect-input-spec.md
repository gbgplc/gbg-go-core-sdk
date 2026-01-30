# CollectInputSpec

## Example Usage

```typescript
import { CollectInputSpec } from "@gbg/go-core/models/operations";

let value: CollectInputSpec = "conditional";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"required" | "optional" | "conditional" | Unrecognized<string>
```