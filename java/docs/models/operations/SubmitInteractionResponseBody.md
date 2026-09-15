# SubmitInteractionResponseBody

Success


## Supported Types

### Discriminator: `status`

| Value | Type |
| ----- | ---- |
| `"success"` | [Success](../../models/operations/Success.md) |
| `"error"` | [SubmitInteractionError](../../models/operations/SubmitInteractionError.md) |

### [`Success`](../../models/operations/Success.md)

Discriminator value: `"success"`

```java
SubmitInteractionResponseBody value = Success.builder()
    .status(StatusSuccess.SUCCESS)
    .build();
```

**Referred Types:** [StatusSuccess](../../models/operations/StatusSuccess.md)

### [`SubmitInteractionError`](../../models/operations/SubmitInteractionError.md)

Discriminator value: `"error"`

```java
SubmitInteractionResponseBody value = SubmitInteractionError.builder()
    .status(SubmitInteractionStatusError.ERROR)
    .code(4178.11)
    .message("<value>")
    .build();
```

**Referred Types:** [SubmitInteractionStatusError](../../models/operations/SubmitInteractionStatusError.md)

## Consumption Patterns

### Java 11+ (Discriminator Switch)

```java
switch (value.status()) {
    case "success":
        // Handle success discriminator variant
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
if (value instanceof Success success) {
    // Handle Success variant
} else if (value instanceof SubmitInteractionError submitInteractionError) {
    // Handle SubmitInteractionError variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case Success success -> {
        // Handle Success variant
    }
    case SubmitInteractionError submitInteractionError -> {
        // Handle SubmitInteractionError variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
