# GetJourneyStateStatus

## Example Usage

```java
import com.gbg.gocore.models.operations.GetJourneyStateStatus;

GetJourneyStateStatus value = GetJourneyStateStatus.COMPLETED;

// Open enum: use .of() to create instances from custom string values
GetJourneyStateStatus custom = GetJourneyStateStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `COMPLETED`   | Completed     |
| `IN_PROGRESS` | InProgress    |
| `FAILED`      | Failed        |
| `PAUSED`      | Paused        |