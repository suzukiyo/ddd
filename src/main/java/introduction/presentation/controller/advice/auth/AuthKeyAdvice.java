package introduction.presentation.controller.advice.auth;

import introduction.apllication.error.auth.AuthKeyException;
import introduction.apllication.service.auth.AuthKeyService;
import introduction.domain.fundamentals.authkey.AuthKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;
import java.util.Objects;

@ControllerAdvice(basePackages = { "introduction.presentation.controller.facade" })
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
