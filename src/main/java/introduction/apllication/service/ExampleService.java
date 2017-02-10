package introduction.apllication.service;

import introduction.domain.model.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    SummaryRepository summaryRepository;

    public int get(){
        return summaryRepository.get();
    }
}
