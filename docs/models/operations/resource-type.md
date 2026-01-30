# ResourceType

## Example Usage

```typescript
import { ResourceType } from "@gbg/go-core/models/operations";

let value: ResourceType = "form";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"brand" | "delivery" | "flow" | "form" | "i18n" | "journey" | "license" | "model" | "organization" | "template" | "interaction" | Unrecognized<string>
```