package tutorial.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestExcpetion extends RuntimeException{
    public BadRequestExcpetion()
    {}

    public BadRequestExcpetion(Throwable cause)
    {
        super(cause);
    }
}
