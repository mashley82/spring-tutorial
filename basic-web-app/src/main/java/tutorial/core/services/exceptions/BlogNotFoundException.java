package tutorial.core.services.exceptions;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }
    public BlogNotFoundException(String message)
    {
        super(message);
    }
    public BlogNotFoundException()
    {}
}
