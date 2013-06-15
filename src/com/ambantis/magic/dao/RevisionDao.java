package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Revision;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:45 PM
 */
public interface RevisionDao {

    public void create(Revision revision) throws DaoException, DaoConnectionException;

    public Revision read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Revision> readAll() throws DaoException, DaoConnectionException;

    public void update(Revision revision) throws DaoException, DaoConnectionException;

    public void delete(Revision revision) throws DaoException, DaoConnectionException;

}
