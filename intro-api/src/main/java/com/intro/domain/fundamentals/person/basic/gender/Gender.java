package com.intro.domain.fundamentals.person.basic.gender;

import com.apllication.configuration.messagesource.MessageResolver;

public enum Gender {
    male,
    female,
    unknown;

    Gender(){
    }

    public String asText() {
        String template = String.format("gender.%s", this);
        return MessageResolver.of(template);
    }
}