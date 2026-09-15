# FetchInteractionDocumentRelationship

## Example Usage

```java
import com.gbg.gocore.models.operations.FetchInteractionDocumentRelationship;

FetchInteractionDocumentRelationship value = FetchInteractionDocumentRelationship.MOTHER;

// Open enum: use .of() to create instances from custom string values
FetchInteractionDocumentRelationship custom = FetchInteractionDocumentRelationship.of("custom_value");
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