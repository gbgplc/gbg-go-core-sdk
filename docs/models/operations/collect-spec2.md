# CollectSpec2

## Example Usage

```typescript
import { CollectSpec2 } from "@gbg/go-core/models/operations";

let value: CollectSpec2 = "conditional";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"required" | "optional" | "conditional" | Unrecognized<string>
```