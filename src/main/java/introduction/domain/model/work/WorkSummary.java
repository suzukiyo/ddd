package introduction.domain.model.work;

import introduction.domain.model.work.basic.WorkBasic;
import introduction.domain.model.work.history.WorkHistories;
import introduction.domain.model.work.skill.WorkSkills;

public class WorkSummary {
    WorkBasic workBasic;
    WorkHistories workHistories;
    WorkSkills workSkills;

    public WorkSummary(WorkBasic workBasic, WorkHistories workHistories, WorkSkills workSkills) {
        this.workBasic = workBasic;
        this.workHistories = workHistories;
        this.workSkills = workSkills;
    }
}
