package tutorial.core.services.exceptions;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public class AccountExistsException extends RuntimeException {
    public AccountExistsException(String message, Throwable cause)
    {
        super(message, cause);
    }
    public AccountExistsException(String message)
    {
        super(message);
    }
    public AccountExistsException()
    {}
}
