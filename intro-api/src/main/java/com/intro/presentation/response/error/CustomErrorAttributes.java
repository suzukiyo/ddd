package com.intro.presentation.response.error;

import com.presentation.response.error.type.CoreErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomErrorAttributes extends DefaultErrorAttributes {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        outputTrace(requestAttributes);
        Map<String, Object> errorAttributes = new LinkedHashMap<String, Object>();
        addStatus(errorAttributes, requestAttributes);
        return errorAttributes;
    }

    private void addStatus(Map<String, Object> errorAttributes, RequestAttributes requestAttributes) {
        Integer status = getAttribute(requestAttributes, "javax.servlet.error.status_code");
        if (status == null) {
            errorAttributes.put("errors", Collections.singletonList(new Error(CoreErrorType.Irregular, "Http Status None")));
            return;
        }
        try {
            errorAttributes.put("errors", Collections.singletonList(new Error(CoreErrorType.Irregular, HttpStatus.valueOf(status).getReasonPhrase())));
        } catch (Exception ex) {
            errorAttributes.put("errors", Collections.singletonList(new Error(CoreErrorType.Irregular, "Http Status " + status)));
        }
    }

    @SuppressWarnings("unchecked")
    private <T> T getAttribute(RequestAttributes requestAttributes, String name) {
        return (T) requestAttributes.getAttribute(name, RequestAttributes.SCOPE_REQUEST);
    }

    private void outputTrace(RequestAttributes requestAttributes) {
        Throwable error = getError(requestAttributes);
        if (error == null) return;
        Integer status = getAttribute(requestAttributes, "javax.servlet.error.status_code");
        if (status != null && status >= 500) {
            logger.error("exception has thrown", error);
            return;
        }
        logger.warn("exception has thrown", error);
    }
}
