package introduction.domain.model.hobby;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hobbies {

    @JsonIgnore
    List<Hobby> values = new ArrayList<>();

    public Hobbies(List<Hobby> values) {
        this.values = values;
    }

    @JsonProperty(value = "items")
    public List<String> values() {
        return values.stream().map(Hobby::value).collect(Collectors.toList());
    }

    public Hobbies() {
    }
}
