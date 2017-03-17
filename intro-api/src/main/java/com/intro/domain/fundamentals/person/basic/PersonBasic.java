package com.intro.domain.fundamentals.person.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.domain.fundamentals.person.basic.birthday.Birthday;
import com.domain.fundamentals.person.basic.gender.Gender;
import com.domain.fundamentals.person.basic.name.FirstName;
import com.domain.fundamentals.person.basic.name.FullName;
import com.domain.fundamentals.person.basic.name.LastName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonBasic {
    @JsonIgnore
    Birthday birthday;

    @JsonIgnore
    Gender gender;

    @JsonIgnore
    FirstName firstName;
    @JsonIgnore
    LastName lastName;

    @JsonProperty(value = "age")
    public Integer age() {
        return birthday.age().value();
    }

    @JsonProperty(value = "gender")
    public String gender() {
        return gender.name();
    }

    @JsonProperty(value = "first_name")
    public String firstName() {
        return firstName.value();
    }

    @JsonProperty(value = "last_name")
    public String lastName() {
        return lastName.value();
    }

    @JsonProperty(value = "full_name")
    public String fullName() {
        return FullName.of(firstName, lastName).value();
    }
}
