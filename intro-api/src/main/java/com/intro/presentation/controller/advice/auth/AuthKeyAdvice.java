package com.intro.presentation.controller.advice.auth;

import com.intro.application.error.auth.AuthKeyException;
import com.intro.application.service.auth.AuthKeyService;
import com.intro.domain.fundamentals.authkey.AuthKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;
import java.util.Objects;

@ControllerAdvice(basePackages = { "com.presentation.controller.facade" })
class AuthKeyAdvice {

    @Autowired
    AuthKeyService apiKeyService;

    @ModelAttribute("api-key")
    AuthKey validateKey(@RequestHeader Map<String,String> headers) throws AuthKeyException {
        AuthKey authKey = new AuthKey(headers.get(AuthKey.name()));
        validSpecify(authKey);
        validDatabase(authKey);
        return authKey;
    }

    private void validSpecify(final AuthKey key) throws AuthKeyException {
        if (Objects.isNull(key.value())) throw new AuthKeyException("required Auth key");
    }

    private void validDatabase(AuthKey key) throws AuthKeyException {
        if (!apiKeyService.isValidKey(key)) throw new AuthKeyException("invalid Auth key");
    }

}
