package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.exception.NotImplementedException;
import com.ambantis.magic.models.Assignment;
import com.ambantis.magic.models.Period;
import com.ambantis.magic.models.Student;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:53 PM
 */
public class PeriodDaoMock implements PeriodDao {
    DaoFactory dao;

    public PeriodDaoMock() {
        dao = DaoFactory.getInstance();
    }

    @Override
    public void create(Period period) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Period read(Integer id) throws DaoException, DaoConnectionException {
        throw new NotImplementedException("not implemented yet");
    }

    @Override
    public ArrayList<Period> readAll() throws DaoException, DaoConnectionException {
        ArrayList<Assignment> tmpAssignments = dao.getAssignmentDao().readAll();
        ArrayList<Student> tmpStudents = dao.getStudentDao().readAll();
        Period p1 = new Period(
                dao.getAssignmentDao().readAll(),
                dao.getStudentDao().readAll(),
                "Art",
                "1"
        );
        Period p2 = new Period(
                dao.getAssignmentDao().readAll(),
                dao.getStudentDao().readAll(),
                "Algebra II",
                "2"
        );
        Period p3 = new Period(
                dao.getAssignmentDao().readAll(),
                dao.getStudentDao().readAll(),
                "US History",
                "3"
        );
        Period p4 = new Period(
                dao.getAssignmentDao().readAll(),
                dao.getStudentDao().readAll(),
                "Spanish",
                "4"
        );
        Period p5 = new Period(
                dao.getAssignmentDao().readAll(),
                dao.getStudentDao().readAll(),
                "English",
                "5"
        );
        Period p6 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "Chemistry",
                "6"
        );
        ArrayList<Period> periods = new ArrayList<Period>();
        periods.add(p1);
        periods.add(p2);
        periods.add(p3);
        periods.add(p4);
        periods.add(p5);
        return periods;
    }

    @Override
    public void update(Period period) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Period period) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
