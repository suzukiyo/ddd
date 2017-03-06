package introduction.presentation.request;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Queries {
    private static final String SEPARATOR = ",";

    String items;

    public Filters filter() {
        if (StringUtils.isEmpty(items)) return Filters.all();
        Filters filters = Filter.of(Arrays.asList(items.split(SEPARATOR)));
        if (filters.isEmpty()) return Filters.all();
        return filters;
    }

}
