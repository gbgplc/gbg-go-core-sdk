# GetJourneyStateStatus

## Example Usage

```typescript
import { GetJourneyStateStatus } from "@gbg/go-core/models/operations";

let value: GetJourneyStateStatus = "Failed";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"Completed" | "InProgress" | "Failed" | "Paused" | Unrecognized<string>
```