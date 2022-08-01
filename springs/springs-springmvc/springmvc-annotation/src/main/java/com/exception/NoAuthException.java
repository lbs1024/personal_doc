package com.exception;

/**
 * @author lbs
 * @description 自定义异常
 */
public class NoAuthException extends RuntimeException {
    public NoAuthException() {
        super();
    }

    public NoAuthException(String message) {
        super(message);
    }

    public NoAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoAuthException(Throwable cause) {
        super(cause);
    }
}
