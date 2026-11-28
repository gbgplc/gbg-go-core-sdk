# SubmitInteractionAnswerUnion


## Supported Types

### Discriminator: `status`

| Value | Type |
| ----- | ---- |
| `"done"` | [SubmitInteractionAnswerDone](../../models/operations/SubmitInteractionAnswerDone.md) |
| `"timeout"` | [SubmitInteractionAnswerTimeout](../../models/operations/SubmitInteractionAnswerTimeout.md) |
| `"error"` | [SubmitInteractionAnswerError1](../../models/operations/SubmitInteractionAnswerError1.md) |

### [`SubmitInteractionAnswerDone`](../../models/operations/SubmitInteractionAnswerDone.md)

Discriminator value: `"done"`

```java
SubmitInteractionAnswerUnion value = SubmitInteractionAnswerDone.builder()
    .status(SubmitInteractionStatusDone.DONE)
    .results(Map.ofEntries(
    ))
    .build();
```

**Referred Types:** [SubmitInteractionStatusDone](../../models/operations/SubmitInteractionStatusDone.md)

### [`SubmitInteractionAnswerTimeout`](../../models/operations/SubmitInteractionAnswerTimeout.md)

Discriminator value: `"timeout"`

```java
SubmitInteractionAnswerUnion value = SubmitInteractionAnswerTimeout.builder()
    .status(SubmitInteractionStatusTimeout.TIMEOUT)
    .build();
```

**Referred Types:** [SubmitInteractionStatusTimeout](../../models/operations/SubmitInteractionStatusTimeout.md)

### [`SubmitInteractionAnswerError1`](../../models/operations/SubmitInteractionAnswerError1.md)

Discriminator value: `"error"`

```java
SubmitInteractionAnswerUnion value = SubmitInteractionAnswerError1.builder()
    .status(SubmitInteractionStatusError.ERROR)
    .error(SubmitInteractionAnswerError2.builder()
        .name("<value>")
        .message("<value>")
        .build())
    .build();
```

**Referred Types:** [SubmitInteractionStatusError](../../models/operations/SubmitInteractionStatusError.md), [SubmitInteractionAnswerError2](../../models/operations/SubmitInteractionAnswerError2.md)

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
if (value instanceof SubmitInteractionAnswerDone submitInteractionAnswerDone) {
    // Handle SubmitInteractionAnswerDone variant
} else if (value instanceof SubmitInteractionAnswerTimeout submitInteractionAnswerTimeout) {
    // Handle SubmitInteractionAnswerTimeout variant
} else if (value instanceof SubmitInteractionAnswerError1 submitInteractionAnswerError1) {
    // Handle SubmitInteractionAnswerError1 variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case SubmitInteractionAnswerDone submitInteractionAnswerDone -> {
        // Handle SubmitInteractionAnswerDone variant
    }
    case SubmitInteractionAnswerTimeout submitInteractionAnswerTimeout -> {
        // Handle SubmitInteractionAnswerTimeout variant
    }
    case SubmitInteractionAnswerError1 submitInteractionAnswerError1 -> {
        // Handle SubmitInteractionAnswerError1 variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
