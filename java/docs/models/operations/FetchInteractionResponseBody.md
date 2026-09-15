# FetchInteractionResponseBody

Success


## Supported Types

### [`ResponseBody1`](../../models/operations/ResponseBody1.md)

```java
FetchInteractionResponseBody value = FetchInteractionResponseBody.of(ResponseBody1.builder()
    .instanceId("<id>")
    .interactionId("<id>")
    .journey(Journey1.builder()
        .status(JourneyStatus1.COMPLETED)
        .build())
    .interaction(Interaction.builder()
        .collects(List.of(
            CollectUnion.of(Collect1.builder()
                .ref("<value>")
                .spec(CollectSpec1.OPTIONAL)
                .build())))
        .consumes(List.of(
            ConsumeUnion.of(Consume1.builder()
                .ref("<value>")
                .spec(ConsumeSpec1.OPTIONAL)
                .build())))
        .grId("<id>")
        .build())
    .build());
```

**Referred Types:**

- [Journey1](../../models/operations/Journey1.md)
- [JourneyStatus1](../../models/operations/JourneyStatus1.md)
- [Interaction](../../models/operations/Interaction.md)
- [CollectUnion](../../models/operations/CollectUnion.md)
- [Collect1](../../models/operations/Collect1.md)
- [CollectSpec1](../../models/operations/CollectSpec1.md)
- [ConsumeUnion](../../models/operations/ConsumeUnion.md)
- [Consume1](../../models/operations/Consume1.md)
- [ConsumeSpec1](../../models/operations/ConsumeSpec1.md)

### [`FetchInteractionError`](../../models/operations/FetchInteractionError.md)

```java
FetchInteractionResponseBody value = FetchInteractionResponseBody.of(FetchInteractionError.builder()
    .status(FetchInteractionStatusError.ERROR)
    .code(6719.06)
    .message("<value>")
    .build());
```

**Referred Types:** [FetchInteractionStatusError](../../models/operations/FetchInteractionStatusError.md)

### [`ResponseBody2`](../../models/operations/ResponseBody2.md)

```java
FetchInteractionResponseBody value = FetchInteractionResponseBody.of(ResponseBody2.builder()
    .instanceId("<id>")
    .journey(Journey2.builder()
        .status(JourneyStatus2.IN_PROGRESS)
        .build())
    .build());
```

**Referred Types:** [Journey2](../../models/operations/Journey2.md), [JourneyStatus2](../../models/operations/JourneyStatus2.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.responseBody1().isPresent()) {
    com.gbg.gocore.models.operations.ResponseBody1 responseBody1Value = value.responseBody1().get();
    // Handle responseBody1 variant
} else if (value.fetchInteractionError().isPresent()) {
    com.gbg.gocore.models.operations.FetchInteractionError fetchInteractionErrorValue = value.fetchInteractionError().get();
    // Handle fetchInteractionError variant
} else if (value.responseBody2().isPresent()) {
    com.gbg.gocore.models.operations.ResponseBody2 responseBody2Value = value.responseBody2().get();
    // Handle responseBody2 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
