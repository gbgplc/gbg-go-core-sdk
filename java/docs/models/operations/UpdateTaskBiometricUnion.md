# UpdateTaskBiometricUnion


## Supported Types

### [`UpdateTaskBiometric1`](../../models/operations/UpdateTaskBiometric1.md)

```java
UpdateTaskBiometricUnion value = UpdateTaskBiometricUnion.of(UpdateTaskBiometric1.builder()
    .face1Image("<value>")
    .face2Image("<value>")
    .build());
```

### [`UpdateTaskBiometric2`](../../models/operations/UpdateTaskBiometric2.md)

```java
UpdateTaskBiometricUnion value = UpdateTaskBiometricUnion.of(UpdateTaskBiometric2.builder()
    .selfieImage("<value>")
    .anchorImage("<value>")
    .build());
```

### [`UpdateTaskBiometric3`](../../models/operations/UpdateTaskBiometric3.md)

```java
UpdateTaskBiometricUnion value = UpdateTaskBiometricUnion.of(UpdateTaskBiometric3.builder()
    .faceImage("<value>")
    .build());
```

### [`UpdateTaskBiometric4`](../../models/operations/UpdateTaskBiometric4.md)

```java
UpdateTaskBiometricUnion value = UpdateTaskBiometricUnion.of(UpdateTaskBiometric4.builder()
    .selfieImage("<value>")
    .build());
```

## Consumption Patterns

### Java 11+ (Accessor Methods)

```java
if (value.updateTaskBiometric1().isPresent()) {
    com.gbg.gocore.models.operations.UpdateTaskBiometric1 updateTaskBiometric1Value = value.updateTaskBiometric1().get();
    // Handle updateTaskBiometric1 variant
} else if (value.updateTaskBiometric2().isPresent()) {
    com.gbg.gocore.models.operations.UpdateTaskBiometric2 updateTaskBiometric2Value = value.updateTaskBiometric2().get();
    // Handle updateTaskBiometric2 variant
} else if (value.updateTaskBiometric3().isPresent()) {
    com.gbg.gocore.models.operations.UpdateTaskBiometric3 updateTaskBiometric3Value = value.updateTaskBiometric3().get();
    // Handle updateTaskBiometric3 variant
} else if (value.updateTaskBiometric4().isPresent()) {
    com.gbg.gocore.models.operations.UpdateTaskBiometric4 updateTaskBiometric4Value = value.updateTaskBiometric4().get();
    // Handle updateTaskBiometric4 variant
} else if (value.asJson().isPresent()) {
    com.fasterxml.jackson.databind.JsonNode raw = value.asJson().get();
    // Handle unknown variant fallback
}
```
