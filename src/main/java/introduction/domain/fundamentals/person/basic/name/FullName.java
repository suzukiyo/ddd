package introduction.domain.fundamentals.person.basic.name;

public class FullName {
    String value;

    private FullName(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public FullName of(FirstName firstName, LastName lastName) {
        return new FullName(firstName.value + lastName.value);
    }
}
