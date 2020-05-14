package com.intro.domain.model;

import com.intro.domain.fundamentals.person.Person;
import com.intro.domain.model.hobby.Hobbies;
import com.intro.domain.model.work.WorkSummary;
import com.intro.presentation.request.Filters;

public interface IntroductionSummaryRepository {
    Person person(Filters filter);
    Hobbies hobbies(Filters filter);
    WorkSummary work(Filters filter);


}
