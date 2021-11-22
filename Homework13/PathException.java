package Homework13;

import java.util.NoSuchElementException;

public class PathException extends NoSuchElementException {

    public PathException(String message) {
        super(message);
    }

    public PathException(String message, Throwable cause) {
        super(message, cause);
    }
}
