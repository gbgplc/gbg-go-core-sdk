# GbgErrorLocation

## Example Usage

```java
import com.gbg.gocore.models.GbgErrorLocation;

GbgErrorLocation value = GbgErrorLocation.PATH;

// Open enum: use .of() to create instances from custom string values
GbgErrorLocation custom = GbgErrorLocation.of("custom_value");
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