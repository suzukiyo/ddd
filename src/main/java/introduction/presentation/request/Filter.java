package introduction.presentation.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Filter {
    person, hobby, work;

    public static Filters of(String[] filter) {
        List<Filter> filters = new ArrayList<>();
        for (Filter value : values()) {
            if (Arrays.asList(filter).contains(value)) {
                filters.add(value);
            }
        }
        return new Filters(filters);
    }
}
