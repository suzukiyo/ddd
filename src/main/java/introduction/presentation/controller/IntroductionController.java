package introduction.presentation.controller;

import introduction.apllication.service.IntroductionService;
import introduction.domain.model.IntroductionSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroductionController {

    @Autowired
    IntroductionService introductionService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public IntroductionSummary findSummary() {
        return introductionService.findSummary();
    }

}