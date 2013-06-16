package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.exception.NotImplementedException;
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
        Student s1 = new Student(dao.getDocumentDao().readAll(), "Victor", "Acarley");
        Student s2 = new Student(dao.getDocumentDao().readAll(), "Jasmine", "Acosta");
        Student s3 = new Student(dao.getDocumentDao().readAll(), "Jonathan", "Aguilar");
        Student s4 = new Student(dao.getDocumentDao().readAll(), "Gerardo", "Alcantar");
        Student s5 = new Student(dao.getDocumentDao().readAll(), "Nelson", "Argueta");
        Student s6 = new Student(dao.getDocumentDao().readAll(), "Ashley", "Arita");
        Student s7 = new Student(dao.getDocumentDao().readAll(), "Delmis", "Arita");
        Student s8 = new Student(dao.getDocumentDao().readAll(), "Ray", "Arteaga");
        Student s9 = new Student(dao.getDocumentDao().readAll(), "Jose", "Avalos");
        Student s10 = new Student(dao.getDocumentDao().readAll(), "Rigo", "Baltazar");
        Student s11 = new Student(dao.getDocumentDao().readAll(), "Alex", "Calero");
        Student s12 = new Student(dao.getDocumentDao().readAll(), "Rudy", "Carreon");
        Student s13 = new Student(dao.getDocumentDao().readAll(), "Daisy", "Chavez");
        Student s14 = new Student(dao.getDocumentDao().readAll(), "Emely", "Chigo");
        Student s15 = new Student(dao.getDocumentDao().readAll(), "Kimberly", "Coto");
        Student s16 = new Student(dao.getDocumentDao().readAll(), "Juan", "DeJesus");
        Student s17 = new Student(dao.getDocumentDao().readAll(), "Katherine", "DelCid");
        Student s18 = new Student(dao.getDocumentDao().readAll(), "Kevin", "Delgado");
        Student s19 = new Student(dao.getDocumentDao().readAll(), "Andrew", "Diaz");
        Student s20 = new Student(dao.getDocumentDao().readAll(), "Robert", "Elotl");
        Student s21 = new Student(dao.getDocumentDao().readAll(), "Anglie", "Escalante");
        Student s22 = new Student(dao.getDocumentDao().readAll(), "Jordy", "Escamilla");
        Student s23 = new Student(dao.getDocumentDao().readAll(), "Manuel", "Escamilla");
        Student s24 = new Student(dao.getDocumentDao().readAll(), "Adla", "Estrada");
        Student s25 = new Student(dao.getDocumentDao().readAll(), "Jocelyn", "Figueroa");
        Student s26 = new Student(dao.getDocumentDao().readAll(), "Richardson", "Keivonne");
        Student s27 = new Student(dao.getDocumentDao().readAll(), "Daisy", "Villasana");
        Student s28 = new Student(dao.getDocumentDao().readAll(), "Sung", "Wang");
        Student s29 = new Student(dao.getDocumentDao().readAll(), "Johnny", "Quest");
        Student s30 = new Student(dao.getDocumentDao().readAll(), "Heriberto", "Martinez");
        Student s31 = new Student(dao.getDocumentDao().readAll(), "Ana", "Nicole");
        Student s32 = new Student(dao.getDocumentDao().readAll(), "Jennifer", "Lopez");
        Student s33 = new Student(dao.getDocumentDao().readAll(), "Suzie", "Que");

        mockStudents.add(s1);
        mockStudents.add(s2);
        mockStudents.add(s3);
        mockStudents.add(s4);
        mockStudents.add(s5);
        mockStudents.add(s6);
        mockStudents.add(s7);
        mockStudents.add(s8);
        mockStudents.add(s9);
        mockStudents.add(s10);
        mockStudents.add(s11);
        mockStudents.add(s12);
        mockStudents.add(s13);
        mockStudents.add(s14);
        mockStudents.add(s15);
        mockStudents.add(s16);
        mockStudents.add(s17);
        mockStudents.add(s18);
        mockStudents.add(s19);
        mockStudents.add(s21);
        mockStudents.add(s22);
        mockStudents.add(s23);
        mockStudents.add(s24);
        mockStudents.add(s25);
        mockStudents.add(s26);
        mockStudents.add(s27);
        mockStudents.add(s28);
        mockStudents.add(s29);
        mockStudents.add(s30);
        mockStudents.add(s31);
        mockStudents.add(s32);
        mockStudents.add(s33);
        return mockStudents;
    }

    @Override
    public void update(Student student) throws DaoException, DaoConnectionException {}

    @Override
    public void delete(Student student) throws DaoException, DaoConnectionException {}
}
