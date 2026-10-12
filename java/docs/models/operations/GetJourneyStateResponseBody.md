# GetJourneyStateResponseBody

Journey state (full by default; slim with ?view=slim)


## Supported Types

### [`StateFetchResponse`](../../models/StateFetchResponse.md)

```java
GetJourneyStateResponseBody value = GetJourneyStateResponseBody.of(StateFetchResponse.builder()
    .instanceId("<id>")
    .status("<value>")
    .build());
```

### [`SlimStateFetchResponse`](../../models/SlimStateFetchResponse.md)

```java
GetJourneyStateResponseBody value = GetJourneyStateResponseBody.of(SlimStateFetchResponse.builder()
    .instanceId("<id>")
    .status(SlimStateFetchResponseStatus.ERROR)
    .build());
```

**Referred Types:** [SlimStateFetchResponseStatus](../../models/SlimStateFetchResponseStatus.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.stateFetchResponse().isPresent()) {
    com.gbg.gocore.models.StateFetchResponse stateFetchResponseValue = value.stateFetchResponse().get();
    // Handle stateFetchResponse variant
} else if (value.slimStateFetchResponse().isPresent()) {
    com.gbg.gocore.models.SlimStateFetchResponse slimStateFetchResponseValue = value.slimStateFetchResponse().get();
    // Handle slimStateFetchResponse variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
