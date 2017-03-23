package com.intro.presentation.controller.advice.language;

import com.intro.domain.fundamentals.language.LanguageType;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@ControllerAdvice(basePackages = {
        "com.presentation.controller.facade"
})
public class LocaleAdvice {

    @ModelAttribute("lang")
    public void setLang(@RequestParam(value = "lang") String lang) {
        if (LanguageType.of(lang).isUnknown()) return;
        Locale locale = new Locale(lang);
        LocaleContextHolder.setLocale(locale);
    }
}
