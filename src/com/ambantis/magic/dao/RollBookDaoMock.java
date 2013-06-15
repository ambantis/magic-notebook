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
    public void create(RollBook rollBook) throws DaoException, DaoConnectionException {}

    @Override
    public RollBook read(Integer id) throws DaoException, DaoConnectionException {
        throw new NotImplementedException("This is a mock");
    }

    @Override
    public ArrayList<RollBook> readAll() throws DaoException, DaoConnectionException {
        ArrayList<RollBook> mRollBooks = new ArrayList<RollBook>();
        mRollBooks.add(new RollBook());
        return mRollBooks;
    }

    @Override
    public void update(RollBook rollBook) throws DaoException, DaoConnectionException {}

    @Override
    public void delete(RollBook rollBook) throws DaoException, DaoConnectionException {}
}
