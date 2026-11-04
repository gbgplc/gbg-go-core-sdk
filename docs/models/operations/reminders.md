# Reminders

Reminders for an invite journey: the invite link is sent again every intervalMinutes, at most maxReminders times, until the journey finishes or the link expires (ttlMinutes), whichever comes first. Resolved as ONE unit, not per member: the first tier that sets it (journey start, then delivery, then organization) wins, and an interval from one tier is never combined with a count from another. Absent everywhere means off. A journey without an invite ignores it. Captain refuses an interval below its operator floor with a 400 naming the tier. Frozen at journey start: editing it later does not reach a running journey.

## Example Usage

```typescript
import { Reminders } from "@gbg/go-core/models/operations";

let value: Reminders = {
  intervalMinutes: 212922,
  maxReminders: 174935,
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `intervalMinutes`                                                        | *number*                                                                 | :heavy_check_mark:                                                       | Minutes between one send of the invite link and the next reminder.       |
| `maxReminders`                                                           | *number*                                                                 | :heavy_check_mark:                                                       | Reminders sent after the first invite, at most 5. 0 turns reminders off. |