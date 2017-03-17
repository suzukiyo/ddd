package com.intro.domain.fundamentals.person.family;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Family {
    @JsonIgnore
    Children children;

    @JsonIgnore
    MaritalStatus maritalStatus;

    @JsonProperty(value = "children")
    public Integer children() {
        return children.value();
    }

    @JsonProperty(value = "marital_status")
    public String maritalStatus() {
        return maritalStatus.name();
    }
}
