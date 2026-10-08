# LocationEnum

## Example Usage

```java
import com.gbg.gocore.models.LocationEnum;

LocationEnum value = LocationEnum.PATH;

// Open enum: use .of() to create instances from custom string values
LocationEnum custom = LocationEnum.of("custom_value");
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