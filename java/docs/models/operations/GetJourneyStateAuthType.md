# GetJourneyStateAuthType

## Example Usage

```java
import com.gbg.gocore.models.operations.GetJourneyStateAuthType;

GetJourneyStateAuthType value = GetJourneyStateAuthType.ACTIVE_AUTHENTICATION;

// Open enum: use .of() to create instances from custom string values
GetJourneyStateAuthType custom = GetJourneyStateAuthType.of("custom_value");
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `ACTIVE_AUTHENTICATION`       | ActiveAuthentication          |
| `BASIC_ACCESS_CONTROL`        | BasicAccessControl            |
| `CHIP_AUTHENTICATION`         | ChipAuthentication            |
| `PASSIVE_AUTHENTICATION`      | PassiveAuthentication         |
| `SUPPLEMENTAL_ACCESS_CONTROL` | SupplementalAccessControl     |
| `EXTENDED_ACCESS_CONTROL`     | ExtendedAccessControl         |
| `TERMINAL_AUTHENTICATION`     | TerminalAuthentication        |