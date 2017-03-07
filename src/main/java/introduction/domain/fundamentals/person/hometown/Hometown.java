package introduction.domain.fundamentals.person.hometown;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hometown {

    @JsonIgnore
    Prefecture prefecture;

    @JsonIgnore
    City city;

    @JsonProperty(value = "home_town")
    public String homeTown() {
        return String.format("%s %s", prefecture.value, city.value);
    }

    @JsonProperty(value = "prefecture")
    public String prefecture() {
        return prefecture.value();
    }

    @JsonProperty(value = "city")
    public String city() {
        return city.value();
    }
}
