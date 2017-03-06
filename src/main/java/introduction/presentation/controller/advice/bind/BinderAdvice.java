package introduction.presentation.controller.advice.bind;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
class BinderAdvice {

    @InitBinder
    void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.registerCustomEditor(Object.class, new StringTrimmerEditor(true));
    }
}
