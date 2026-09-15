# FetchInteractionResult

## Example Usage

```java
import com.gbg.gocore.models.operations.FetchInteractionResult;

FetchInteractionResult value = FetchInteractionResult.SUCCESS;

// Open enum: use .of() to create instances from custom string values
FetchInteractionResult custom = FetchInteractionResult.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `SUCCESS` | Success   |
| `FAILURE` | Failure   |
| `SKIPPED` | Skipped   |