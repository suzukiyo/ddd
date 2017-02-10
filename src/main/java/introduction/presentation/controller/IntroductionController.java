package introduction.presentation.controller;

import introduction.apllication.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroductionController {

    @Autowired
    ExampleService exampleService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public int get() {
        return exampleService.get();
    }

}