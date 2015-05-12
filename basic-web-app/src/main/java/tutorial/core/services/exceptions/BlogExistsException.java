package tutorial.core.services.exceptions;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public class BlogExistsException extends RuntimeException {
    public BlogExistsException()
    {}

    public BlogExistsException(String message)
    {
        super(message);
    }
    public  BlogExistsException(String message, Throwable cause)
    {
        super(message, cause);
    }
    public BlogExistsException(Throwable cause)
    {
        super(cause);
    }
}
