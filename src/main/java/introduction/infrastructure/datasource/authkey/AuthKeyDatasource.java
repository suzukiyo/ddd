package introduction.infrastructure.datasource.authkey;

import introduction.domain.fundamentals.authkey.AuthKey;
import introduction.domain.fundamentals.authkey.AuthKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthKeyDatasource implements AuthKeyRepository {

    @Autowired
    AuthKeyMapper mapper;

    @Override
    public boolean isValidKey(AuthKey target) {
        AuthKey result = mapper.findKeyByValue(target.value());
        if( result == null ) return false;
        return true;
    }


}
