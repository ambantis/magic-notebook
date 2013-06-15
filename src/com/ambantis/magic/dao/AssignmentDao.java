package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Assignment;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:24 PM
 */
public interface AssignmentDao {

    public void create(Assignment assignment) throws DaoException, DaoConnectionException;

    public Assignment read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Assignment> readAll() throws DaoException, DaoConnectionException;

    public void update(Assignment assignment) throws DaoException, DaoConnectionException;

    public void delete(Assignment assignment) throws DaoException, DaoConnectionException;
}
