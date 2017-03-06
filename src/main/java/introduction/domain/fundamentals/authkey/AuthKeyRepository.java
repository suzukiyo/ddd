package introduction.domain.fundamentals.authkey;

public interface AuthKeyRepository {
    boolean isValidKey(AuthKey key);
}
