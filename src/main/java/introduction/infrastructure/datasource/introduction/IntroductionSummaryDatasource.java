package introduction.infrastructure.datasource.introduction;

import introduction.domain.fundamentals.person.Person;
import introduction.domain.model.IntroductionSummaryRepository;
import introduction.domain.model.hobby.Hobbies;
import introduction.domain.model.hobby.Hobby;
import introduction.domain.model.work.WorkSummary;
import introduction.domain.model.work.basic.WorkBasic;
import introduction.domain.model.work.history.WorkHistories;
import introduction.domain.model.work.history.WorkHistory;
import introduction.domain.model.work.skill.WorkSkill;
import introduction.domain.model.work.skill.WorkSkills;
import introduction.presentation.request.Filters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IntroductionSummaryDatasource implements IntroductionSummaryRepository {

    @Autowired
    IntroductionSummaryMapper introductionSummaryMapper;

    @Override
    public Person person(Filters filter) {
        if (!filter.hasPerson()) return new Person();
        return introductionSummaryMapper.findPerson();
    }

    @Override
    public Hobbies hobbies(Filters filter) {
        if (!filter.hasHobby()) return new Hobbies();
        List<Hobby> hobbies = introductionSummaryMapper.findHobbies();
        if (hobbies == null) return new Hobbies();
        return new Hobbies(hobbies);
    }

    @Override
    public WorkSummary work(Filters filter) {
        if (!filter.hasWork()) return new WorkSummary();
        return new WorkSummary(workBasic(), workHistories(), workSkills());
    }

    private WorkBasic workBasic() {
        return introductionSummaryMapper.findWorkBasic();
    }

    private WorkHistories workHistories() {
        List<WorkHistory> workHistories = introductionSummaryMapper.findWorkHistories();
        if (workHistories == null) return new WorkHistories();
        return new WorkHistories(workHistories);
    }

    private WorkSkills workSkills() {
        List<WorkSkill> workSkills = introductionSummaryMapper.findWorkSkills();
        if (workSkills == null) return new WorkSkills();
        return new WorkSkills(workSkills);
    }

}
