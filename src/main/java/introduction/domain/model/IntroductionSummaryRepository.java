package introduction.domain.model;

import introduction.domain.fundamentals.person.Person;
import introduction.domain.model.hobby.Hobbies;
import introduction.domain.model.work.WorkSummary;
import introduction.presentation.request.Filters;

public interface IntroductionSummaryRepository {
    Person person(Filters filter);
    Hobbies hobbies(Filters filter);
    WorkSummary work(Filters filter);
}
