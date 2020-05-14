package com.intro.presentation.controller.facade;

import com.intro.application.service.introduction.IntroductionService;
import com.intro.domain.model.IntroductionSummary;
import com.intro.domain.model.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/com")
class IntroductionController {

    @Autowired
    IntroductionService introductionService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    IntroductionSummary findSummary(@ModelAttribute @Validated Queries queries) {
        return introductionService.findSummary(queries.filter());
    }

}