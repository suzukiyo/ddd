package introduction.apllication.service;

import introduction.domain.fundamentals.person.Person;
import introduction.domain.model.IntroductionSummary;
import introduction.domain.model.IntroductionSummaryRepository;
import introduction.domain.model.hobby.Hobbies;
import introduction.domain.model.work.WorkSummary;
import introduction.presentation.request.Filters;
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
