package introduction.presentation.request;

import java.util.List;

public class Filters {
    List<Filter> values;

    public Filters(List<Filter> values) {
        this.values = values;
    }

    public boolean hasPerson() {
        return values.stream().allMatch(value -> value == Filter.person);
    }

    public boolean hasHobby() {
        return values.stream().allMatch(value -> value == Filter.hobby);
    }

    public boolean hasWork() {
        return values.stream().allMatch(value -> value == Filter.work);
    }
}
