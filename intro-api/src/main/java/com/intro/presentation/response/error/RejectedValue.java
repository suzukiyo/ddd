package com.intro.presentation.response.error;

import org.springframework.validation.FieldError;

import java.util.Arrays;

class RejectedValue {
    Object value;

    RejectedValue() {
    }

    RejectedValue(Object value) {
        this.value = value;
    }

    static RejectedValue of(FieldError error) {
        if (unspecified(error)) return new RejectedValue();
        if (outputBlank(error)) return new RejectedValue("");
        return new RejectedValue(error.getRejectedValue());
    }

    private static boolean unspecified(FieldError error) {
        return Arrays.stream(error.getCodes()).anyMatch(code -> code.startsWith("Assert"));
    }

    private static boolean outputBlank(FieldError error) {
        return error.getRejectedValue() == null;
    }

    public Object value() {
        return value;
    }
}
