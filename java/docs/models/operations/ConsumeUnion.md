# ConsumeUnion


## Supported Types

### [`Consume1`](../../models/operations/Consume1.md)

```java
ConsumeUnion value = ConsumeUnion.of(Consume1.builder()
    .ref("<value>")
    .spec(ConsumeSpec1.CONDITIONAL)
    .build());
```

**Referred Types:** [ConsumeSpec1](../../models/operations/ConsumeSpec1.md)

### [`Consume2`](../../models/operations/Consume2.md)

```java
ConsumeUnion value = ConsumeUnion.of(Consume2.builder()
    .ref("<value>")
    .spec(ConsumeSpec2.REQUIRED)
    .combinator(ConsumeCombinator.ONE_OF)
    .inputs(List.of())
    .build());
```

**Referred Types:** [ConsumeSpec2](../../models/operations/ConsumeSpec2.md), [ConsumeCombinator](../../models/operations/ConsumeCombinator.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.consume1().isPresent()) {
    com.gbg.gocore.models.operations.Consume1 consume1Value = value.consume1().get();
    // Handle consume1 variant
} else if (value.consume2().isPresent()) {
    com.gbg.gocore.models.operations.Consume2 consume2Value = value.consume2().get();
    // Handle consume2 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
