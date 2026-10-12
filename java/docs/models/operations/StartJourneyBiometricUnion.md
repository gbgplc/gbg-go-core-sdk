# StartJourneyBiometricUnion


## Supported Types

### [`StartJourneyBiometric1`](../../models/operations/StartJourneyBiometric1.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometric1.builder()
    .face1Image("<value>")
    .face2Image("<value>")
    .build());
```

### [`StartJourneyBiometric2`](../../models/operations/StartJourneyBiometric2.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometric2.builder()
    .selfieImage("<value>")
    .anchorImage("<value>")
    .build());
```

### [`StartJourneyBiometric3`](../../models/operations/StartJourneyBiometric3.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometric3.builder()
    .faceImage("<value>")
    .build());
```

### [`StartJourneyBiometric4`](../../models/operations/StartJourneyBiometric4.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometric4.builder()
    .selfieImage("<value>")
    .build());
```

### [`StartJourneyBiometric5`](../../models/operations/StartJourneyBiometric5.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometric5.builder()
    .anchorImage("<value>")
    .build());
```

### [`StartJourneyBiometricStoredFace`](../../models/operations/StartJourneyBiometricStoredFace.md)

```java
StartJourneyBiometricUnion value = StartJourneyBiometricUnion.of(StartJourneyBiometricStoredFace.builder()
    .type(StartJourneyBiometricType.STORED_FACE)
    .templateReference("<value>")
    .build());
```

**Referred Types:** [StartJourneyBiometricType](../../models/operations/StartJourneyBiometricType.md)

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.startJourneyBiometric1().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometric1 startJourneyBiometric1Value = value.startJourneyBiometric1().get();
    // Handle startJourneyBiometric1 variant
} else if (value.startJourneyBiometric2().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometric2 startJourneyBiometric2Value = value.startJourneyBiometric2().get();
    // Handle startJourneyBiometric2 variant
} else if (value.startJourneyBiometric3().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometric3 startJourneyBiometric3Value = value.startJourneyBiometric3().get();
    // Handle startJourneyBiometric3 variant
} else if (value.startJourneyBiometric4().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometric4 startJourneyBiometric4Value = value.startJourneyBiometric4().get();
    // Handle startJourneyBiometric4 variant
} else if (value.startJourneyBiometric5().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometric5 startJourneyBiometric5Value = value.startJourneyBiometric5().get();
    // Handle startJourneyBiometric5 variant
} else if (value.startJourneyBiometricStoredFace().isPresent()) {
    com.gbg.gocore.models.operations.StartJourneyBiometricStoredFace startJourneyBiometricStoredFaceValue = value.startJourneyBiometricStoredFace().get();
    // Handle startJourneyBiometricStoredFace variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
