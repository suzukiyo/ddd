package introduction.domain.fundamentals.person.basic.gender;

import introduction.apllication.configuration.messagesource.MessageResolver;

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