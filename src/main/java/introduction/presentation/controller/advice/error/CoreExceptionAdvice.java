package introduction.presentation.controller.advice.error;

import introduction.apllication.error.auth.AuthKeyException;
import introduction.presentation.response.error.Errors;
import introduction.presentation.response.error.type.CoreErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
class CoreExceptionAdvice implements ExceptionAdvice {

/* ------------------------------------------------------------------------------- *
 *  400 Bad Request
 * ------------------------------------------------------------------------------- */

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
        MissingServletRequestParameterException.class
    })
    @ResponseBody
    public Errors missing(Exception exception) {
        CoreErrorType type = CoreErrorType.BadRequest;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors( type, exception);
    }

    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class )
    @ResponseBody
    public Errors invalid(BindException exception) {
        return bindingError(exception, exception.getBindingResult());
    }

    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class )
    @ResponseBody
    public Errors invalid(MethodArgumentNotValidException exception) {
        return bindingError(exception, exception.getBindingResult());
    }

    private Errors bindingError(Exception exception, BindingResult bindingResult) {
        CoreErrorType type = CoreErrorType.FieldError;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors(bindingResult.getFieldErrors());
    }

/* ------------------------------------------------------------------------------- *
 *  401 Unauthorized
 * ------------------------------------------------------------------------------- */

    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(AuthKeyException.class)
    @ResponseBody
    public Errors forbidden(Exception exception) {
        CoreErrorType type = CoreErrorType.Unauthorized;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors(type, exception);
    }

/* ------------------------------------------------------------------------------- *
 *  404 Not Found
 * ------------------------------------------------------------------------------- */

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            NoHandlerFoundException.class
    })
    @ResponseBody
    public Errors notFound(Exception exception) {
        CoreErrorType type = CoreErrorType.NotFound;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors(type, exception);
    }

/* ------------------------------------------------------------------------------- *
 *  405 Method Not Allowed
 * ------------------------------------------------------------------------------- */

    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public Errors methodNotAllowed(Exception exception) {
        CoreErrorType type = CoreErrorType.MethodNotAllowed;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors(type, exception);
    }

/* ------------------------------------------------------------------------------- *
 *  406 Not Acceptable
 * ------------------------------------------------------------------------------- */

    @ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler({
            HttpMessageNotReadableException.class
    })
    @ResponseBody
    public Errors notReadableRequestType(Exception exception) {
        CoreErrorType type = CoreErrorType.UnprocessableEntity;
        ExceptionAdvice.outputWarnLog(type, exception);
        return new Errors(type, HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase());
    }

}
