package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Assignment;
import java.util.Date;

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
        Assignment s1 = new Assignment("Learning to Love Yourself", "1", new Date(), new Date());
        Assignment s2 = new Assignment("Que Paso?", "2", new Date(), new Date());
        Assignment s3 = new Assignment("How To Hack Your Way to Hollywood", "3", new Date(), new Date());
        Assignment s4 = new Assignment("Lose 50 pounds for only $9.95 per year", "4", new Date(), new Date());
        Assignment s5 = new Assignment("The Next Bubble: North Korean Hip Hop", "5", new Date(), new Date());
        tmpAssignments.add(s1);
        tmpAssignments.add(s2);
        tmpAssignments.add(s3);
        tmpAssignments.add(s4);
        tmpAssignments.add(s5);
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
