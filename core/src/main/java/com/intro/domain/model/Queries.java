package com.intro.domain.model;

import com.intro.domain.validation.query.item.QueryItemExistence;
import org.apache.commons.lang3.StringUtils;

public class Queries {
    @QueryItemExistence
    String items;

    public Filters filter() {
        if (StringUtils.isEmpty(items)) return Filters.all();
        return Filter.of(items);
    }

}
