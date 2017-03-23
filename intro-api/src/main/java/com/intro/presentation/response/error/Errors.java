package com.intro.presentation.response.error;

import com.intro.presentation.response.error.type.ErrorType;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Errors {
    List<Error> errors;

    public Errors( Error error ) {
        this.errors = Collections.singletonList(error);
    }

    public Errors(ErrorType type, String message) {
        this(new Error(type, message));
    }

    public Errors(ErrorType type, Exception exception) {
        this(type, exception.getMessage());
    }

    public Errors(List<FieldError> fieldErrors) {
        this.errors = new ArrayList<>();
        for (FieldError each : fieldErrors) {
            this.errors.add(Error.of(each));
        }
    }
}
