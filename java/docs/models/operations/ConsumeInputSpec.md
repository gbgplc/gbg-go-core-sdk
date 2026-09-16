# ConsumeInputSpec

## Example Usage

```java
import com.gbg.gocore.models.operations.ConsumeInputSpec;

ConsumeInputSpec value = ConsumeInputSpec.REQUIRED;

// Open enum: use .of() to create instances from custom string values
ConsumeInputSpec custom = ConsumeInputSpec.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `REQUIRED`    | required      |
| `OPTIONAL`    | optional      |
| `CONDITIONAL` | conditional   |