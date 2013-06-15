package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Period;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:43 PM
 */
public interface PeriodDao {

    public void create(Period period) throws DaoException, DaoConnectionException;

    public Period read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Period> readAll() throws DaoException, DaoConnectionException;

    public void update(Period period) throws DaoException, DaoConnectionException;

    public void delete(Period period) throws DaoException, DaoConnectionException;


}
