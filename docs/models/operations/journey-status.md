# JourneyStatus

## Example Usage

```typescript
import { JourneyStatus } from "@gbg/go-core/models/operations";

let value: JourneyStatus = "Paused";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"Completed" | "InProgress" | "Failed" | "Paused" | Unrecognized<string>
```