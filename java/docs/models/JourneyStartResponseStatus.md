# JourneyStartResponseStatus

## Example Usage

```java
import com.gbg.gocore.models.JourneyStartResponseStatus;

JourneyStartResponseStatus value = JourneyStartResponseStatus.STARTED;

// Open enum: use .of() to create instances from custom string values
JourneyStartResponseStatus custom = JourneyStartResponseStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `STARTED`        | started          |
| `COMPLETED`      | completed        |
| `FAILED`         | failed           |
| `AWAITING_INPUT` | awaiting-input   |
| `PENDING`        | pending          |