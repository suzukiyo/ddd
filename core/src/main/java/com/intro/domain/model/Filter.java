package com.intro.domain.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum Filter {
    person, hobby, work;

    private static final String SEPARATOR = ",";

    public static Filters of(List<String> filter) {
        if (filter == null) return new Filters(Collections.EMPTY_LIST);
        return new Filters(Arrays.stream(values())
                .filter(value -> filter.contains(value.name()))
                .collect(Collectors.toList()));
    }

    public static Filters of(String filter) {
        return of(Arrays.asList(filter.split(SEPARATOR)));
    }
}
