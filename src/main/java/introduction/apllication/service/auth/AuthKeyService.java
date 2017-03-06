package introduction.apllication.service.auth;

import introduction.domain.fundamentals.authkey.AuthKey;
import introduction.domain.fundamentals.authkey.AuthKeyRepository;
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
