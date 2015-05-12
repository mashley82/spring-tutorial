package tutorial.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {
    public ConflictException()
    {}

    public ConflictException(Throwable cause)
    {
        super(cause);
    }
}
