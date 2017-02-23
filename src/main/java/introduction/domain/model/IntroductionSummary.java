package introduction.domain.model;

import introduction.domain.fundamentals.person.Person;
import introduction.domain.model.hobby.Hobbies;
import introduction.domain.model.work.WorkSummary;

public class IntroductionSummary {
    Person person;
    Hobbies hobbies;
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
