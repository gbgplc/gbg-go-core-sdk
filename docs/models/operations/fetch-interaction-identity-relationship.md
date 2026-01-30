# FetchInteractionIdentityRelationship

## Example Usage

```typescript
import { FetchInteractionIdentityRelationship } from "@gbg/go-core/models/operations";

let value: FetchInteractionIdentityRelationship = "paternalGrandFather";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"mother" | "father" | "maternalGrandFather" | "maternalGrandMother" | "paternalGrandFather" | "paternalGrandMother" | Unrecognized<string>
```