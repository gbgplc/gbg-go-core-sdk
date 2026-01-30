# GetTasksStatus

## Example Usage

```typescript
import { GetTasksStatus } from "@gbg/go-core/models/operations";

let value: GetTasksStatus = "InProgress";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"Completed" | "InProgress" | "Failed" | "Paused" | Unrecognized<string>
```