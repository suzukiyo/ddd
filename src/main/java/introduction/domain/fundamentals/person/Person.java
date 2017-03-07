package introduction.domain.fundamentals.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import introduction.domain.fundamentals.person.basic.PersonBasic;
import introduction.domain.fundamentals.person.family.Family;
import introduction.domain.fundamentals.person.hometown.Hometown;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    @JsonProperty(value = "basic")
    PersonBasic personBasic;

    @JsonProperty(value = "family")
    Family family;

    @JsonProperty(value = "hometown")
    Hometown hometown;
}
