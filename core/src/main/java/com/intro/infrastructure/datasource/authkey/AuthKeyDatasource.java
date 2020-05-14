package com.intro.infrastructure.datasource.authkey;

import com.domain.fundamentals.authkey.AuthKey;
import com.domain.fundamentals.authkey.AuthKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthKeyDatasource implements AuthKeyRepository {

    @Autowired
    AuthKeyMapper mapper;

    @Override
    public boolean isValidKey(AuthKey target) {
        AuthKey result = mapper.findKeyByValue(target.value());
        return result != null;
    }


}
