package introduction.presentation.response.error;

import org.springframework.validation.FieldError;

class ErrorMessage {
    String value;

    ErrorMessage(String value) {
        this.value = value;
    }

    static ErrorMessage of(FieldError error) {
        return new ErrorMessage(error.getDefaultMessage());
    }

    public String value() {
        return value;
    }
}
