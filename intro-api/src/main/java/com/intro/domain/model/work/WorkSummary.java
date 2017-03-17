package com.intro.domain.model.work;

import com.intro.domain.model.work.basic.WorkBasic;
import com.intro.domain.model.work.history.WorkHistories;
import com.intro.domain.model.work.skill.WorkSkills;

public class WorkSummary {
    WorkBasic workBasic;
    WorkHistories workHistories;
    WorkSkills workSkills;

    public WorkSummary(WorkBasic workBasic, WorkHistories workHistories, WorkSkills workSkills) {
        this.workBasic = workBasic;
        this.workHistories = workHistories;
        this.workSkills = workSkills;
    }

    public WorkSummary() {
    }
}
