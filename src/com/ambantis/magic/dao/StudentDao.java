package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Student;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:48 PM
 */
public interface StudentDao {

    public void create(Student student) throws DaoException, DaoConnectionException;

    public Student read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Student> readAll() throws DaoException, DaoConnectionException;

    public void update(Student student) throws DaoException, DaoConnectionException;

    public void delete(Student student) throws DaoException, DaoConnectionException;

}
