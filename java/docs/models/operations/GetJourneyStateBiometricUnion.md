# GetJourneyStateBiometricUnion


## Supported Types

### [`GetJourneyStateBiometric1`](../../models/operations/GetJourneyStateBiometric1.md)

```java
GetJourneyStateBiometricUnion value = GetJourneyStateBiometricUnion.of(GetJourneyStateBiometric1.builder()
    .face1Image("<value>")
    .face2Image("<value>")
    .build());
```

### [`GetJourneyStateBiometric2`](../../models/operations/GetJourneyStateBiometric2.md)

```java
GetJourneyStateBiometricUnion value = GetJourneyStateBiometricUnion.of(GetJourneyStateBiometric2.builder()
    .selfieImage("<value>")
    .anchorImage("<value>")
    .build());
```

### [`GetJourneyStateBiometric3`](../../models/operations/GetJourneyStateBiometric3.md)

```java
GetJourneyStateBiometricUnion value = GetJourneyStateBiometricUnion.of(GetJourneyStateBiometric3.builder()
    .faceImage("<value>")
    .build());
```

### [`GetJourneyStateBiometric4`](../../models/operations/GetJourneyStateBiometric4.md)

```java
GetJourneyStateBiometricUnion value = GetJourneyStateBiometricUnion.of(GetJourneyStateBiometric4.builder()
    .selfieImage("<value>")
    .build());
```

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.getJourneyStateBiometric1().isPresent()) {
    com.gbg.gocore.models.operations.GetJourneyStateBiometric1 getJourneyStateBiometric1Value = value.getJourneyStateBiometric1().get();
    // Handle getJourneyStateBiometric1 variant
} else if (value.getJourneyStateBiometric2().isPresent()) {
    com.gbg.gocore.models.operations.GetJourneyStateBiometric2 getJourneyStateBiometric2Value = value.getJourneyStateBiometric2().get();
    // Handle getJourneyStateBiometric2 variant
} else if (value.getJourneyStateBiometric3().isPresent()) {
    com.gbg.gocore.models.operations.GetJourneyStateBiometric3 getJourneyStateBiometric3Value = value.getJourneyStateBiometric3().get();
    // Handle getJourneyStateBiometric3 variant
} else if (value.getJourneyStateBiometric4().isPresent()) {
    com.gbg.gocore.models.operations.GetJourneyStateBiometric4 getJourneyStateBiometric4Value = value.getJourneyStateBiometric4().get();
    // Handle getJourneyStateBiometric4 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
