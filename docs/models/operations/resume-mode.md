# ResumeMode

How resume behaves for this delivery: off (no credential minted — pre-resume behavior) or resume (the applicant may return until an absolute deadline). There is no park setting and no park behavior; what park expressed is the window resume already grants. resume uses resumeExpiryMinutes and off uses no lifetime member at all — supplying one under off is rejected. An operator bound can only cap this DOWN, never raise it.

## Example Usage

```typescript
import { ResumeMode } from "@gbg/go-core/models/operations";

let value: ResumeMode = "off";
```

## Values

```typescript
"off" | "resume"
```