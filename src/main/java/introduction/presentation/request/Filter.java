package introduction.presentation.request;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

enum Filter {
    person, hobby, work;

    public static Filters of(List<String> filter) {
        if (filter == null) return new Filters(Collections.EMPTY_LIST);
        return new Filters(Arrays.stream(values())
                .filter(value -> filter.contains(value.name()))
                .collect(Collectors.toList()));
    }
}
