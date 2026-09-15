# GetTasksSchemaStatus

## Example Usage

```java
import com.gbg.gocore.models.operations.GetTasksSchemaStatus;

GetTasksSchemaStatus value = GetTasksSchemaStatus.COMPLETED;

// Open enum: use .of() to create instances from custom string values
GetTasksSchemaStatus custom = GetTasksSchemaStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `COMPLETED`   | Completed     |
| `IN_PROGRESS` | InProgress    |
| `FAILED`      | Failed        |
| `PAUSED`      | Paused        |