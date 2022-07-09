package classwork.lesson19;

public class NoWhiteSpaceException extends Exception {

    public NoWhiteSpaceException() {
    }

    public NoWhiteSpaceException(String message) {
        super(message);
    }

    public NoWhiteSpaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoWhiteSpaceException(Throwable cause) {
        super(cause);
    }

    public NoWhiteSpaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}