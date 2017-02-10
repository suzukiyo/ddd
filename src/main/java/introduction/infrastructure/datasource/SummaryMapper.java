package introduction.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SummaryMapper {
    int get();
}
