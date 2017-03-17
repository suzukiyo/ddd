package com.intro.apllication.service.auth;

import com.domain.fundamentals.authkey.AuthKey;
import com.domain.fundamentals.authkey.AuthKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthKeyService {

    @Autowired
    AuthKeyRepository apiKeyRepository;

    public boolean isValidKey( AuthKey key ) {
        return apiKeyRepository.isValidKey(key);
    }
}
