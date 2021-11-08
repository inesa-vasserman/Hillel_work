package Homework10;

public class MyDataArrayException extends RuntimeException {
    public MyDataArrayException(String message) {
        super(message);
    }

    public MyDataArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
