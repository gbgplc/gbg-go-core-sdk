# ConsumeCombinator

## Example Usage

```typescript
import { ConsumeCombinator } from "@gbg/go-core/models/operations";

let value: ConsumeCombinator = "allOf";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"oneOf" | "allOf" | Unrecognized<string>
```