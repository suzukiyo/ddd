package introduction.domain.fundamentals.person.basic.birthday;

import introduction.apllication.configuration.messagesource.MessageResolver;

public class Age {
    Integer value;

    public Age(Integer value) {
        this.value = value;
    }

    public String asText() {
        return MessageResolver.of("age", value);
    }
}
