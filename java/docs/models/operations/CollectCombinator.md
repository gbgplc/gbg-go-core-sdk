# CollectCombinator

## Example Usage

```java
import com.gbg.gocore.models.operations.CollectCombinator;

CollectCombinator value = CollectCombinator.ONE_OF;

// Open enum: use .of() to create instances from custom string values
CollectCombinator custom = CollectCombinator.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `ONE_OF` | oneOf    |
| `ALL_OF` | allOf    |