package introduction.domain.fundamentals.person.basic;

import introduction.domain.fundamentals.person.basic.birthday.Birthday;
import introduction.domain.fundamentals.person.basic.gender.Gender;
import introduction.domain.fundamentals.person.basic.name.FirstName;
import introduction.domain.fundamentals.person.basic.name.FullName;
import introduction.domain.fundamentals.person.basic.name.LastName;

public class PersonBasic {
    Birthday birthday;
    Gender gender;
    FirstName firstName;
    LastName lastName;

    public FullName fullName() {
        return FullName.of(firstName, lastName);
    }
}
