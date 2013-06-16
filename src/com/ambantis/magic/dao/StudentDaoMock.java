package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.exception.NotImplementedException;
import com.ambantis.magic.models.Document;
import com.ambantis.magic.models.Student;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:54 PM
 */
public class StudentDaoMock implements StudentDao {
    @Override
    public void create(Student student) throws DaoException, DaoConnectionException {
        throw new NotImplementedException("mock object");
    }

    @Override
    public Student read(Integer id) throws DaoException, DaoConnectionException {
        throw new NotImplementedException("mock object");
    }

    @Override
    public ArrayList<Student> readAll() throws DaoException, DaoConnectionException {
        DaoFactory dao = DaoFactory.getInstance();
        ArrayList<Student> mockStudents = new ArrayList<Student>();
        ArrayList<Document> docs =  DaoFactory.getInstance().getDocumentDao().readAll();
        Student s1 = new Student(dao.getDocumentDao().readAll(), "Johnny", "Quest");
        Student s2 = new Student(dao.getDocumentDao().readAll(), "Heriberto", "Martinez");
        Student s3 = new Student(dao.getDocumentDao().readAll(), "Ana", "Nicole");
        Student s4 = new Student(dao.getDocumentDao().readAll(), "Jennifer", "Lopez");
        Student s5 = new Student(dao.getDocumentDao().readAll(), "Suzie", "Que");
        mockStudents.add(s1);
        mockStudents.add(s2);
        mockStudents.add(s3);
        mockStudents.add(s4);
        mockStudents.add(s5);
        return mockStudents;
    }

    @Override
    public void update(Student student) throws DaoException, DaoConnectionException {}

    @Override
    public void delete(Student student) throws DaoException, DaoConnectionException {}
}
