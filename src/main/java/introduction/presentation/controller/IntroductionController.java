package introduction.presentation.controller;

import introduction.apllication.service.IntroductionService;
import introduction.domain.model.IntroductionSummary;
import introduction.presentation.request.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/introduction")
public class IntroductionController {

    @Autowired
    IntroductionService introductionService;

    @RequestMapping(method= RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public IntroductionSummary findSummary(@ModelAttribute @Validated Queries queries) {
        return introductionService.findSummary(queries.filter());
    }

}