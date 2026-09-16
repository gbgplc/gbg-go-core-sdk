# GetJourneyStateDocumentRelationship

## Example Usage

```java
import com.gbg.gocore.models.operations.GetJourneyStateDocumentRelationship;

GetJourneyStateDocumentRelationship value = GetJourneyStateDocumentRelationship.MOTHER;

// Open enum: use .of() to create instances from custom string values
GetJourneyStateDocumentRelationship custom = GetJourneyStateDocumentRelationship.of("custom_value");
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `MOTHER`                | mother                  |
| `FATHER`                | father                  |
| `MATERNAL_GRAND_FATHER` | maternalGrandFather     |
| `MATERNAL_GRAND_MOTHER` | maternalGrandMother     |
| `PATERNAL_GRAND_FATHER` | paternalGrandFather     |
| `PATERNAL_GRAND_MOTHER` | paternalGrandMother     |