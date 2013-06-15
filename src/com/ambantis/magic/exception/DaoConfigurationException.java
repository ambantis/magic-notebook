package com.ambantis.magic.exception;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:28 PM
 */

public class DaoConfigurationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DaoConfigurationException(String message) {
        super(message);
    }

    public DaoConfigurationException(Throwable cause) {
        super(cause);
    }

    public DaoConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
