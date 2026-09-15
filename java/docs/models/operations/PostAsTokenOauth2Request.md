# PostAsTokenOauth2Request


## Supported Types

### Discriminator: `grantType`

| Value | Type |
| ----- | ---- |
| `"password"` | [PasswordGrantRequest](../../models/PasswordGrantRequest.md) |
| `"client_credentials"` | [ClientCredentialsGrantRequest](../../models/ClientCredentialsGrantRequest.md) |

### [`PasswordGrantRequest`](../../models/PasswordGrantRequest.md)

Discriminator value: `"password"`

```java
PostAsTokenOauth2Request value = PasswordGrantRequest.builder()
    .clientId("<id>")
    .clientSecret("<value>")
    .username("Liana.Padberg97")
    .password("m36VkhLclPGZsz9")
    .grantType(PasswordGrantRequestGrantType.PASSWORD)
    .build();
```

**Referred Types:** [PasswordGrantRequestGrantType](../../models/PasswordGrantRequestGrantType.md)

### [`ClientCredentialsGrantRequest`](../../models/ClientCredentialsGrantRequest.md)

Discriminator value: `"client_credentials"`

```java
PostAsTokenOauth2Request value = ClientCredentialsGrantRequest.builder()
    .clientId("<id>")
    .clientSecret("<value>")
    .grantType(ClientCredentialsGrantRequestGrantType.CLIENT_CREDENTIALS)
    .build();
```

**Referred Types:** [ClientCredentialsGrantRequestGrantType](../../models/ClientCredentialsGrantRequestGrantType.md)

## Consumption Patterns

### Java 11+ (Discriminator Switch)

```java
switch (value.grantType()) {
    case "password":
        // Handle password discriminator variant
        break;
    case "client_credentials":
        // Handle client_credentials discriminator variant
        break;
    default:
        // Handle unknown discriminator variant
}
```

### Java 16+ (Instanceof Pattern Matching)

```java
if (value instanceof PasswordGrantRequest passwordGrantRequest) {
    // Handle PasswordGrantRequest variant
} else if (value instanceof ClientCredentialsGrantRequest clientCredentialsGrantRequest) {
    // Handle ClientCredentialsGrantRequest variant
} else {
    // Handle unknown discriminator variant
}
```

### Java 21+ (Type Pattern Switch)

```java
switch (value) {
    case PasswordGrantRequest passwordGrantRequest -> {
        // Handle PasswordGrantRequest variant
    }
    case ClientCredentialsGrantRequest clientCredentialsGrantRequest -> {
        // Handle ClientCredentialsGrantRequest variant
    }
    default -> {
        // Handle unknown discriminator variant
    }
}
```
