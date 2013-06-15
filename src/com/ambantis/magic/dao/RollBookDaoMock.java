package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.exception.NotImplementedException;
import com.ambantis.magic.models.RollBook;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:54 PM
 */
public class RollBookDaoMock implements RollBookDao {
    @Override
    public RollBook read() throws DaoException, DaoConnectionException {
        throw new NotImplementedException("not yet");
    }
}
