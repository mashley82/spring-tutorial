package tutorial.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException()
    {}

    public NotFoundException(Throwable cause)
    {
        super(cause);
    }
}
