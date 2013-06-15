package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.RollBook;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:46 PM
 */
public interface RollBookDao {
    public void create(RollBook rollBook) throws DaoException, DaoConnectionException;

    public RollBook read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<RollBook> readAll() throws DaoException, DaoConnectionException;

    public void update(RollBook rollBook) throws DaoException, DaoConnectionException;

    public void delete(RollBook rollBook) throws DaoException, DaoConnectionException;

}
