package com.ambantis.magic.exception;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:25 PM
 */
public class DaoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DaoException(String message) {
        super(message);
        }

    public DaoException(Throwable cause) {
        super(cause);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

}
