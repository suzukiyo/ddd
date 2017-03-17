package com.intro.presentation.response.error;

import com.google.common.base.CaseFormat;
import org.springframework.validation.FieldError;

import java.util.Arrays;

class ErrorField {
    String value;

    ErrorField() {
    }

    ErrorField(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    static ErrorField of(FieldError error) {
        if (unspecified(error)) return new ErrorField();
        return new ErrorField(convert(error.getField()));
    }

    private static String convert(String field) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
    }

    private static boolean unspecified(FieldError error) {
        return Arrays.stream(error.getCodes()).anyMatch(code -> code.startsWith("Assert"));
    }

}
