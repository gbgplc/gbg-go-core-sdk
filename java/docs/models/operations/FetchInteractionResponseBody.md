# FetchInteractionResponseBody

Interaction state (full by default; slim with ?view=slim)


## Supported Types

### [`InteractionFetchResponse`](../../models/InteractionFetchResponse.md)

```java
FetchInteractionResponseBody value = FetchInteractionResponseBody.of(InteractionFetchResponse.builder()
    .instanceId("<id>")
    .journey(InteractionFetchResponseJourney.builder()
        .status("<value>")
        .build())
    .build());
```

**Referred Types:** [InteractionFetchResponseJourney](../../models/InteractionFetchResponseJourney.md)

### [`SlimInteractionFetchResponse`](../../models/SlimInteractionFetchResponse.md)

```java
FetchInteractionResponseBody value = FetchInteractionResponseBody.of(SlimInteractionFetchResponse.builder()
    .instanceId("<id>")
    .journey(SlimInteractionFetchResponseJourney.builder()
        .status(SlimInteractionFetchResponseStatus.FAILED)
        .build())
    .build());
```

**Referred Types:** [SlimInteractionFetchResponseJourney](../../models/SlimInteractionFetchResponseJourney.md), [SlimInteractionFetchResponseStatus](../../models/SlimInteractionFetchResponseStatus.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.interactionFetchResponse().isPresent()) {
    com.gbg.gocore.models.InteractionFetchResponse interactionFetchResponseValue = value.interactionFetchResponse().get();
    // Handle interactionFetchResponse variant
} else if (value.slimInteractionFetchResponse().isPresent()) {
    com.gbg.gocore.models.SlimInteractionFetchResponse slimInteractionFetchResponseValue = value.slimInteractionFetchResponse().get();
    // Handle slimInteractionFetchResponse variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
