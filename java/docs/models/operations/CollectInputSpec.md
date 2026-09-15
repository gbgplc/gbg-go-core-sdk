# CollectInputSpec

## Example Usage

```java
import com.gbg.gocore.models.operations.CollectInputSpec;

CollectInputSpec value = CollectInputSpec.REQUIRED;

// Open enum: use .of() to create instances from custom string values
CollectInputSpec custom = CollectInputSpec.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `REQUIRED`    | required      |
| `OPTIONAL`    | optional      |
| `CONDITIONAL` | conditional   |