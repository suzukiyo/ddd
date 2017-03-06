package introduction.presentation.response.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import introduction.presentation.response.error.type.CoreErrorType;
import introduction.presentation.response.error.type.ErrorType;
import org.springframework.validation.FieldError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

    @JsonProperty("type")
    private ErrorType errorType;

    @JsonProperty("field")
    private String errorField;

    @JsonProperty("rejected_value")
    private Object rejectedValue;

    @JsonProperty("message")
    private String errorMessage;

    public Error(ErrorType errorType, String errorMessage) {
        this.errorType = errorType;
        this.errorMessage = errorMessage;
    }

    public Error(ErrorType errorType, String errorField, Object rejectedValue, String errorMessage) {
        this.errorType = errorType;
        this.errorField = errorField;
        this.rejectedValue = rejectedValue;
        this.errorMessage = errorMessage;
    }

    public Error(ErrorType errorType, ErrorField errorErrorField, RejectedValue rejectedValue, ErrorMessage errorMessage) {
        this.errorType = errorType;
        this.errorField = errorErrorField.value();
        this.rejectedValue = rejectedValue.value();
        this.errorMessage = errorMessage.value();
    }

    public static Error of(FieldError error) {
        ErrorType type = CoreErrorType.FieldError;
        ErrorField errorField = ErrorField.of(error);
        RejectedValue rejectedValue = RejectedValue.of(error);
        ErrorMessage errorMessage = ErrorMessage.of(error);
        return new Error(type, errorField, rejectedValue, errorMessage);
    }
}
