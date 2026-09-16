# SubmitInteractionBiometricUnion


## Supported Types

### [`SubmitInteractionBiometric1`](../../models/operations/SubmitInteractionBiometric1.md)

```java
SubmitInteractionBiometricUnion value = SubmitInteractionBiometricUnion.of(SubmitInteractionBiometric1.builder()
    .face1Image("<value>")
    .face2Image("<value>")
    .build());
```

### [`SubmitInteractionBiometric2`](../../models/operations/SubmitInteractionBiometric2.md)

```java
SubmitInteractionBiometricUnion value = SubmitInteractionBiometricUnion.of(SubmitInteractionBiometric2.builder()
    .selfieImage("<value>")
    .anchorImage("<value>")
    .build());
```

### [`SubmitInteractionBiometric3`](../../models/operations/SubmitInteractionBiometric3.md)

```java
SubmitInteractionBiometricUnion value = SubmitInteractionBiometricUnion.of(SubmitInteractionBiometric3.builder()
    .faceImage("<value>")
    .build());
```

### [`SubmitInteractionBiometric4`](../../models/operations/SubmitInteractionBiometric4.md)

```java
SubmitInteractionBiometricUnion value = SubmitInteractionBiometricUnion.of(SubmitInteractionBiometric4.builder()
    .selfieImage("<value>")
    .build());
```

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.submitInteractionBiometric1().isPresent()) {
    com.gbg.gocore.models.operations.SubmitInteractionBiometric1 submitInteractionBiometric1Value = value.submitInteractionBiometric1().get();
    // Handle submitInteractionBiometric1 variant
} else if (value.submitInteractionBiometric2().isPresent()) {
    com.gbg.gocore.models.operations.SubmitInteractionBiometric2 submitInteractionBiometric2Value = value.submitInteractionBiometric2().get();
    // Handle submitInteractionBiometric2 variant
} else if (value.submitInteractionBiometric3().isPresent()) {
    com.gbg.gocore.models.operations.SubmitInteractionBiometric3 submitInteractionBiometric3Value = value.submitInteractionBiometric3().get();
    // Handle submitInteractionBiometric3 variant
} else if (value.submitInteractionBiometric4().isPresent()) {
    com.gbg.gocore.models.operations.SubmitInteractionBiometric4 submitInteractionBiometric4Value = value.submitInteractionBiometric4().get();
    // Handle submitInteractionBiometric4 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
