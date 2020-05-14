package com.intro.application.service.introduction;

import com.intro.domain.fundamentals.person.Person;
import com.intro.domain.model.Filters;
import com.intro.domain.model.IntroductionSummary;
import com.intro.domain.model.IntroductionSummaryRepository;
import com.intro.domain.model.hobby.Hobbies;
import com.intro.domain.model.work.WorkSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntroductionService {

    @Autowired
    IntroductionSummaryRepository introductionSummaryRepository;

    public IntroductionSummary findSummary(Filters filter){
        Person person = introductionSummaryRepository.person(filter);
        Hobbies hobbies = introductionSummaryRepository.hobbies(filter);
        WorkSummary workSummary = introductionSummaryRepository.work(filter);
        return IntroductionSummary.create(person, hobbies, workSummary);
    }
}
