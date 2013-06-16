package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConfigurationException;
import com.ambantis.magic.exception.DaoConnectionException;

import java.sql.Connection;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 3:11 PM
 */
public class DaoFactoryMock extends DaoFactory {

    private static DaoFactoryMock mDaoFactoryMock = null;
    private DaoFactoryMock() {}

    public static DaoFactoryMock getInstance() {
        if (mDaoFactoryMock == null) {
            mDaoFactoryMock = new DaoFactoryMock();
        }
        return mDaoFactoryMock;
    }

    public static void init() throws DaoConfigurationException, DaoConnectionException {
        // todo:2013-06-15:ambantis:NOT IMPLEMENTED YET
    }


    @Override
    Connection getConnection() throws DaoConfigurationException, DaoConnectionException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
