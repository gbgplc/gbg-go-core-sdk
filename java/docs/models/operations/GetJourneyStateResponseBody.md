# GetJourneyStateResponseBody

Journey state (full by default; slim with ?view=slim)


## Supported Types

### Discriminator: `view`

| Value | Type |
| ----- | ---- |
| `"full"` | [StateFetchResponse](../../models/StateFetchResponse.md) |
| `"slim"` | [SlimStateFetchResponse](../../models/SlimStateFetchResponse.md) |

### [`StateFetchResponse`](../../models/StateFetchResponse.md)

Discriminator value: `"full"`

```java
GetJourneyStateResponseBody value = StateFetchResponse.builder()
    .view(StateFetchResponseView.FULL)
    .instanceId("<id>")
    .status("<value>")
    .build();
```

**Referred Types:** [StateFetchResponseView](../../models/StateFetchResponseView.md)

### [`SlimStateFetchResponse`](../../models/SlimStateFetchResponse.md)

Discriminator value: `"slim"`

```java
GetJourneyStateResponseBody value = SlimStateFetchResponse.builder()
    .view(SlimStateFetchResponseView.SLIM)
    .instanceId("<id>")
    .status(SlimStateFetchResponseStatus.ERROR)
    .build();
```

**Referred Types:** [SlimStateFetchResponseView](../../models/SlimStateFetchResponseView.md), [SlimStateFetchResponseStatus](../../models/SlimStateFetchResponseStatus.md)

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
if (value instanceof StateFetchResponse stateFetchResponse) {
    // Handle StateFetchResponse variant
} else if (value instanceof SlimStateFetchResponse slimStateFetchResponse) {
    // Handle SlimStateFetchResponse variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case StateFetchResponse stateFetchResponse -> {
        // Handle StateFetchResponse variant
    }
    case SlimStateFetchResponse slimStateFetchResponse -> {
        // Handle SlimStateFetchResponse variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
