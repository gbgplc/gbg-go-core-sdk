# StartJourneyAnswerUnion


## Supported Types

### Discriminator: `status`

| Value | Type |
| ----- | ---- |
| `"done"` | [StartJourneyAnswerDone](../../models/operations/StartJourneyAnswerDone.md) |
| `"timeout"` | [StartJourneyAnswerTimeout](../../models/operations/StartJourneyAnswerTimeout.md) |
| `"error"` | [StartJourneyAnswerError1](../../models/operations/StartJourneyAnswerError1.md) |

### [`StartJourneyAnswerDone`](../../models/operations/StartJourneyAnswerDone.md)

Discriminator value: `"done"`

```java
StartJourneyAnswerUnion value = StartJourneyAnswerDone.builder()
    .status(StartJourneyStatusDone.DONE)
    .results(Map.ofEntries(
    ))
    .build();
```

**Referred Types:** [StartJourneyStatusDone](../../models/operations/StartJourneyStatusDone.md)

### [`StartJourneyAnswerTimeout`](../../models/operations/StartJourneyAnswerTimeout.md)

Discriminator value: `"timeout"`

```java
StartJourneyAnswerUnion value = StartJourneyAnswerTimeout.builder()
    .status(StartJourneyStatusTimeout.TIMEOUT)
    .build();
```

**Referred Types:** [StartJourneyStatusTimeout](../../models/operations/StartJourneyStatusTimeout.md)

### [`StartJourneyAnswerError1`](../../models/operations/StartJourneyAnswerError1.md)

Discriminator value: `"error"`

```java
StartJourneyAnswerUnion value = StartJourneyAnswerError1.builder()
    .status(StartJourneyStatusError.ERROR)
    .error(StartJourneyAnswerError2.builder()
        .name("<value>")
        .message("<value>")
        .build())
    .build();
```

**Referred Types:** [StartJourneyStatusError](../../models/operations/StartJourneyStatusError.md), [StartJourneyAnswerError2](../../models/operations/StartJourneyAnswerError2.md)

## Consumption Patterns

### Java 11+ (Discriminator Switch)

```java
switch (value.status()) {
    case "done":
        // Handle done discriminator variant
        break;
    case "timeout":
        // Handle timeout discriminator variant
        break;
    case "error":
        // Handle error discriminator variant
        break;
    default:
        // Handle unknown discriminator variant
}
```

### Java 16+ (Instanceof Pattern Matching)

```java
if (value instanceof StartJourneyAnswerDone startJourneyAnswerDone) {
    // Handle StartJourneyAnswerDone variant
} else if (value instanceof StartJourneyAnswerTimeout startJourneyAnswerTimeout) {
    // Handle StartJourneyAnswerTimeout variant
} else if (value instanceof StartJourneyAnswerError1 startJourneyAnswerError1) {
    // Handle StartJourneyAnswerError1 variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case StartJourneyAnswerDone startJourneyAnswerDone -> {
        // Handle StartJourneyAnswerDone variant
    }
    case StartJourneyAnswerTimeout startJourneyAnswerTimeout -> {
        // Handle StartJourneyAnswerTimeout variant
    }
    case StartJourneyAnswerError1 startJourneyAnswerError1 -> {
        // Handle StartJourneyAnswerError1 variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
