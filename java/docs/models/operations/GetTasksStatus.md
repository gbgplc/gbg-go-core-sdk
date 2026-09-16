# GetTasksStatus

## Example Usage

```java
import com.gbg.gocore.models.operations.GetTasksStatus;

GetTasksStatus value = GetTasksStatus.COMPLETED;

// Open enum: use .of() to create instances from custom string values
GetTasksStatus custom = GetTasksStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `COMPLETED`   | Completed     |
| `IN_PROGRESS` | InProgress    |
| `FAILED`      | Failed        |
| `PAUSED`      | Paused        |