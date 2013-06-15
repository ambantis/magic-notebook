package com.ambantis.magic.exception;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 3:33 PM
 */
public class NotImplementedException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    public NotImplementedException(String message) {
        super(message);
    }

    public NotImplementedException(Throwable cause) {
        super(cause);
    }

    public NotImplementedException(String message, Throwable cause) {
        super(message, cause);
    }
}
