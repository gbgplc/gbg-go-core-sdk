# FetchInteractionResponseBody

Interaction state (full by default; slim with ?view=slim)


## Supported Types

### Discriminator: `view`

| Value | Type |
| ----- | ---- |
| `"full"` | [InteractionFetchResponse](../../models/InteractionFetchResponse.md) |
| `"slim"` | [SlimInteractionFetchResponse](../../models/SlimInteractionFetchResponse.md) |

### [`InteractionFetchResponse`](../../models/InteractionFetchResponse.md)

Discriminator value: `"full"`

```java
FetchInteractionResponseBody value = InteractionFetchResponse.builder()
    .view(InteractionFetchResponseView.FULL)
    .instanceId("<id>")
    .journey(InteractionFetchResponseJourney.builder()
        .status("<value>")
        .build())
    .outstandingGroups(List.of(
        OutstandingGroup.builder()
            .elementId("<id>")
            .cardinality("at-least-one")
            .refs(List.of(
                "<value 1>",
                "<value 2>",
                "<value 3>"))
            .build()))
    .build();
```

**Referred Types:**

- [InteractionFetchResponseView](../../models/InteractionFetchResponseView.md)
- [InteractionFetchResponseJourney](../../models/InteractionFetchResponseJourney.md)
- [OutstandingGroup](../../models/OutstandingGroup.md)

### [`SlimInteractionFetchResponse`](../../models/SlimInteractionFetchResponse.md)

Discriminator value: `"slim"`

```java
FetchInteractionResponseBody value = SlimInteractionFetchResponse.builder()
    .view(SlimInteractionFetchResponseView.SLIM)
    .instanceId("<id>")
    .journey(SlimInteractionFetchResponseJourney.builder()
        .status(SlimInteractionFetchResponseStatus.FAILED)
        .build())
    .outstandingGroups(List.of(
        OutstandingGroup.builder()
            .elementId("<id>")
            .cardinality("at-least-one")
            .refs(List.of(
                "<value 1>",
                "<value 2>",
                "<value 3>"))
            .build()))
    .build();
```

**Referred Types:**

- [SlimInteractionFetchResponseView](../../models/SlimInteractionFetchResponseView.md)
- [SlimInteractionFetchResponseJourney](../../models/SlimInteractionFetchResponseJourney.md)
- [SlimInteractionFetchResponseStatus](../../models/SlimInteractionFetchResponseStatus.md)
- [OutstandingGroup](../../models/OutstandingGroup.md)

## Consumption Patterns

### Java 11+ (Discriminator Switch)

```java
switch (value.view()) {
    case "full":
        // Handle full discriminator variant
        break;
    case "slim":
        // Handle slim discriminator variant
        break;
    default:
        // Handle unknown discriminator variant
}
```

### Java 16+ (Instanceof Pattern Matching)

```java
if (value instanceof InteractionFetchResponse interactionFetchResponse) {
    // Handle InteractionFetchResponse variant
} else if (value instanceof SlimInteractionFetchResponse slimInteractionFetchResponse) {
    // Handle SlimInteractionFetchResponse variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case InteractionFetchResponse interactionFetchResponse -> {
        // Handle InteractionFetchResponse variant
    }
    case SlimInteractionFetchResponse slimInteractionFetchResponse -> {
        // Handle SlimInteractionFetchResponse variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
