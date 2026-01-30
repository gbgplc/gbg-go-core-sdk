# FetchInteractionAuthType

## Example Usage

```typescript
import { FetchInteractionAuthType } from "@gbg/go-core/models/operations";

let value: FetchInteractionAuthType = "PassiveAuthentication";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"ActiveAuthentication" | "BasicAccessControl" | "ChipAuthentication" | "PassiveAuthentication" | "SupplementalAccessControl" | "ExtendedAccessControl" | "TerminalAuthentication" | Unrecognized<string>
```