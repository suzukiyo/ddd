package introduction.domain.fundamentals.basic;

import introduction.apllication.configuration.messagesource.MessageResolver;

public enum Gender {
    male,
    female,
    unknown;

    public String asText() {
        String template = String.format("gender.%s", this);
        return MessageResolver.of(template);
    }
}