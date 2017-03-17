package com.intro.application.service;

import com.intro.domain.fundamentals.person.Person;
import com.intro.domain.model.IntroductionSummaryRepository;
import com.intro.domain.model.hobby.Hobbies;
import com.intro.domain.model.work.WorkSummary;
import com.intro.presentation.request.Filters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class IntroductionServiceTest {

    IntroductionSummaryRepository introductionSummaryRepository = mock(IntroductionSummaryRepository.class);

    @Test
    public void all() {
        Person person = new Person();
        when(introductionSummaryRepository.person(Filters.all())).thenReturn(person);

        Hobbies hobbies = new Hobbies();
        when(introductionSummaryRepository.hobbies(Filters.all())).thenReturn(hobbies);

        WorkSummary workSummary = new WorkSummary();
        when(introductionSummaryRepository.work(Filters.all())).thenReturn(workSummary);
    }
}
