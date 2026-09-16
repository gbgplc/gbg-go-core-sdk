# CollectUnion


## Supported Types

### [`Collect1`](../../models/operations/Collect1.md)

```java
CollectUnion value = CollectUnion.of(Collect1.builder()
    .ref("<value>")
    .spec(CollectSpec1.OPTIONAL)
    .build());
```

**Referred Types:** [CollectSpec1](../../models/operations/CollectSpec1.md)

### [`Collect2`](../../models/operations/Collect2.md)

```java
CollectUnion value = CollectUnion.of(Collect2.builder()
    .ref("<value>")
    .spec(CollectSpec2.REQUIRED)
    .combinator(CollectCombinator.ALL_OF)
    .inputs(List.of())
    .build());
```

**Referred Types:** [CollectSpec2](../../models/operations/CollectSpec2.md), [CollectCombinator](../../models/operations/CollectCombinator.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.collect1().isPresent()) {
    com.gbg.gocore.models.operations.Collect1 collect1Value = value.collect1().get();
    // Handle collect1 variant
} else if (value.collect2().isPresent()) {
    com.gbg.gocore.models.operations.Collect2 collect2Value = value.collect2().get();
    // Handle collect2 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
