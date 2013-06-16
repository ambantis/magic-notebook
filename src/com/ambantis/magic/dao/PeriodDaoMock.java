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
        Period p1 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "Art",
                "1"
        );
        Period p2 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "Algebra II",
                "2"
        );
        Period p3 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "US History",
                "3"
        );
        Period p4 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "Spanish",
                "4"
        );
        Period p5 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "English",
                "5"
        );
        Period p6 = new Period(
                new ArrayList<Assignment>(),
                new ArrayList<Student>(),
                "Chemistry",
                "6"
        );
        ArrayList<Period> tmpPeriods = new ArrayList<Period>();
        tmpPeriods.add(p1);
        tmpPeriods.add(p2);
        tmpPeriods.add(p3);
        tmpPeriods.add(p4);
        tmpPeriods.add(p5);
        tmpPeriods.add(p6);

        ArrayList<Assignment> tmpAssignments = new ArrayList<Assignment>();
        tmpAssignments = DaoFactory.getInstance().getAssignmentDao().readAll();

        ArrayList<Student> tmpStudents = new ArrayList<Student>();
        tmpStudents = DaoFactory.getInstance().getStudentDao().readAll();

        for (Period p : tmpPeriods) {
            p.setmAssignments(tmpAssignments);
            p.setmStudents(tmpStudents);
        }
        return tmpPeriods;
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
