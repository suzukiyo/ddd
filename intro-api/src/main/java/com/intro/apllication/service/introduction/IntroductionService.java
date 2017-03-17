package com.intro.apllication.service.introduction;

import com.domain.fundamentals.person.Person;
import com.domain.model.IntroductionSummary;
import com.domain.model.IntroductionSummaryRepository;
import com.domain.model.hobby.Hobbies;
import com.domain.model.work.WorkSummary;
import com.presentation.request.Filters;
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
        return new IntroductionSummary(person, hobbies, workSummary);
    }
}
