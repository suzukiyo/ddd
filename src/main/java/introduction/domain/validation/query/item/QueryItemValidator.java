package introduction.domain.validation.query.item;

import introduction.presentation.request.Filter;
import introduction.presentation.request.Filters;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class QueryItemValidator implements ConstraintValidator<QueryItemExistence, String>{

    @Override
    public void initialize(QueryItemExistence annotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value)) return true;
        Filters filters = Filter.of(value);
        return filters.isEmpty() ? false : true;
    }
}
