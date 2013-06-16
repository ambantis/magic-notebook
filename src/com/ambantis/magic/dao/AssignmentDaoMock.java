package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Assignment;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:52 PM
 */
public class AssignmentDaoMock implements AssignmentDao {
    @Override
    public void create(Assignment assignment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Assignment read(Integer id) throws DaoException, DaoConnectionException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayList<Assignment> readAll() throws DaoException, DaoConnectionException {
        ArrayList<Assignment> tmpAssignments = new ArrayList<Assignment>();
        Assignment s1 = Assignment.getNullAssignment();
        tmpAssignments.add(s1);
        return tmpAssignments;
    }

    @Override
    public void update(Assignment assignment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Assignment assignment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
