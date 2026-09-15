# FetchInteractionBiometricUnion


## Supported Types

### [`FetchInteractionBiometric1`](../../models/operations/FetchInteractionBiometric1.md)

```java
FetchInteractionBiometricUnion value = FetchInteractionBiometricUnion.of(FetchInteractionBiometric1.builder()
    .face1Image("<value>")
    .face2Image("<value>")
    .build());
```

### [`FetchInteractionBiometric2`](../../models/operations/FetchInteractionBiometric2.md)

```java
FetchInteractionBiometricUnion value = FetchInteractionBiometricUnion.of(FetchInteractionBiometric2.builder()
    .selfieImage("<value>")
    .anchorImage("<value>")
    .build());
```

### [`FetchInteractionBiometric3`](../../models/operations/FetchInteractionBiometric3.md)

```java
FetchInteractionBiometricUnion value = FetchInteractionBiometricUnion.of(FetchInteractionBiometric3.builder()
    .faceImage("<value>")
    .build());
```

### [`FetchInteractionBiometric4`](../../models/operations/FetchInteractionBiometric4.md)

```java
FetchInteractionBiometricUnion value = FetchInteractionBiometricUnion.of(FetchInteractionBiometric4.builder()
    .selfieImage("<value>")
    .build());
```

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.fetchInteractionBiometric1().isPresent()) {
    com.gbg.gocore.models.operations.FetchInteractionBiometric1 fetchInteractionBiometric1Value = value.fetchInteractionBiometric1().get();
    // Handle fetchInteractionBiometric1 variant
} else if (value.fetchInteractionBiometric2().isPresent()) {
    com.gbg.gocore.models.operations.FetchInteractionBiometric2 fetchInteractionBiometric2Value = value.fetchInteractionBiometric2().get();
    // Handle fetchInteractionBiometric2 variant
} else if (value.fetchInteractionBiometric3().isPresent()) {
    com.gbg.gocore.models.operations.FetchInteractionBiometric3 fetchInteractionBiometric3Value = value.fetchInteractionBiometric3().get();
    // Handle fetchInteractionBiometric3 variant
} else if (value.fetchInteractionBiometric4().isPresent()) {
    com.gbg.gocore.models.operations.FetchInteractionBiometric4 fetchInteractionBiometric4Value = value.fetchInteractionBiometric4().get();
    // Handle fetchInteractionBiometric4 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
