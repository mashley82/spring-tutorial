package tutorial.core.services.exceptions;

import tutorial.core.models.entities.Blog;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public class AccountDoesNotExistException extends RuntimeException{
    public AccountDoesNotExistException(Throwable cause)
    {
        super(cause);
    }

    public AccountDoesNotExistException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public AccountDoesNotExistException(String message)
    {
        super(message);
    }

    public AccountDoesNotExistException()
    {}
}
