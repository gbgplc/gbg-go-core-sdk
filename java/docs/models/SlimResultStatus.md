# SlimResultStatus

Headline result state, and the AUTHORITATIVE signal for whether the journey succeeded. `complete` means the journey finished. `error` means it ended in failure: either a module reported a terminal error, or the platform abandoned the journey before it could finish (a deadlock, an interaction or execution timeout, or a spin). Abandonment is reported as `error` rather than as a distinct value. `pending` is reported for a running journey once its state has materialized. `timeout` is part of this range but is not currently emitted at journey level — an elapsed deadline surfaces as `error`. When `status` disagrees with `outcome` or `outcomeClassification`, `status` wins: a journey can pass an evaluation and then fail before finishing, leaving a positive classification beside `status: "error"`. Both are true — the evaluation did pass — but the journey did not complete, so do not read a positive classification as success. Note also that an `error` caused by abandonment is generally NOT retryable — a deadlocked journey deadlocks again — even though the accompanying error advises a retry; start a new journey instead.

## Example Usage

```java
import com.gbg.gocore.models.SlimResultStatus;

SlimResultStatus value = SlimResultStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
SlimResultStatus custom = SlimResultStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | pending    |
| `COMPLETE` | complete   |
| `ERROR`    | error      |
| `TIMEOUT`  | timeout    |