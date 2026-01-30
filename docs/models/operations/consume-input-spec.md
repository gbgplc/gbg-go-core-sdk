# ConsumeInputSpec

## Example Usage

```typescript
import { ConsumeInputSpec } from "@gbg/go-core/models/operations";

let value: ConsumeInputSpec = "optional";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"required" | "optional" | "conditional" | Unrecognized<string>
```