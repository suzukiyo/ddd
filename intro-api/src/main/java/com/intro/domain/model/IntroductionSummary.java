package com.intro.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.domain.fundamentals.person.Person;
import com.domain.model.hobby.Hobbies;
import com.domain.model.work.WorkSummary;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IntroductionSummary {

    @JsonProperty(value = "person")
    Person person;

    @JsonProperty(value = "hobbies")
    Hobbies hobbies;

    @JsonProperty(value = "works")
    WorkSummary workSummary;

    public IntroductionSummary(Person person, Hobbies hobbies, WorkSummary workSummary) {
        this.person = person;
        this.hobbies = hobbies;
        this.workSummary = workSummary;
    }

    public static IntroductionSummary create(Person person, Hobbies hobbies, WorkSummary workSummary) {
        return new IntroductionSummary(person, hobbies, workSummary);
    }
}
