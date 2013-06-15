package com.ambantis.magic.exception;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:30 PM
 */
public class DaoConnectionException extends Exception {

    private static final long serialVersionUID = 1L;

    public DaoConnectionException(String message) {
        super(message);
    }

    public DaoConnectionException(Throwable cause) {
        super(cause);
    }

    public DaoConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
