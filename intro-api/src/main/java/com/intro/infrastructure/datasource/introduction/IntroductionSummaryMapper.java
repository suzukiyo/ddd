package com.intro.infrastructure.datasource.introduction;

import com.intro.domain.fundamentals.person.Person;
import com.intro.domain.model.hobby.Hobby;
import com.intro.domain.model.work.basic.WorkBasic;
import com.intro.domain.model.work.history.WorkHistory;
import com.intro.domain.model.work.skill.WorkSkill;
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
