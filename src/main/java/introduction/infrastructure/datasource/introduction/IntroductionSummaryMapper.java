package introduction.infrastructure.datasource.introduction;

import introduction.domain.fundamentals.person.Person;
import introduction.domain.model.hobby.Hobby;
import introduction.domain.model.work.basic.WorkBasic;
import introduction.domain.model.work.history.WorkHistory;
import introduction.domain.model.work.skill.WorkSkill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IntroductionSummaryMapper {
    Person findPerson();

    List<Hobby> findHobbies();

    WorkBasic findWorkBasic();
    List<WorkHistory> findWorkHistories();
    List<WorkSkill> findWorkSkills();
}
