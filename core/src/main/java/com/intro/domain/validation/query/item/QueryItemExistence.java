package com.intro.domain.validation.query.item;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {QueryItemValidator.class})
@Target({FIELD})
@Retention(RUNTIME)
public @interface QueryItemExistence {
    String message() default "Query item is not supported.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
