# SlimModuleStepErrorLocation

## Example Usage

```java
import com.gbg.gocore.models.SlimModuleStepErrorLocation;

SlimModuleStepErrorLocation value = SlimModuleStepErrorLocation.PATH;

// Open enum: use .of() to create instances from custom string values
SlimModuleStepErrorLocation custom = SlimModuleStepErrorLocation.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `PATH`          | Path            |
| `AUTHORIZATION` | Authorization   |
| `HEADER`        | Header          |
| `QUERY_STRING`  | Query String    |
| `REQUEST`       | Request         |
| `BODY`          | Body            |
| `SERVICE`       | Service         |
| `FLOW`          | Flow            |