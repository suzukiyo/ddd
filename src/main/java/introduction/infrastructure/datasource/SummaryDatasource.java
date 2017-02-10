package introduction.infrastructure.datasource;

import introduction.domain.model.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SummaryDatasource implements SummaryRepository {

    @Autowired
    SummaryMapper summaryMapper;

    @Override
    public int get() {
        return summaryMapper.get();
    }

}
