package introduction.apllication.service;

import introduction.domain.model.IntroductionSummary;
import introduction.domain.model.IntroductionSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntroductionService {

    @Autowired
    IntroductionSummaryRepository introductionSummaryRepository;

    public IntroductionSummary findSummary(){
        return introductionSummaryRepository.findSummary();
    }
}
