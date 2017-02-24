package introduction.presentation.request;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class Filters {
    List<Filter> values;

    public Filters(List<Filter> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(values);
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

    public static Filters all() {
        return new Filters(Arrays.asList(Filter.values()));
    }
}
