package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Comment;
import com.ambantis.magic.models.Student;

import java.util.ArrayList;
import java.util.Date;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:52 PM
 */
public class CommentDaoMock implements CommentDao {
    @Override
    public void create(Comment comment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Comment read(Integer id) throws DaoException, DaoConnectionException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayList<Comment> readAll() throws DaoException, DaoConnectionException {
        ArrayList<Comment> tmpComments = new ArrayList<Comment>();
        ArrayList<Student> tmpStudents = DaoFactory.getInstance().getStudentDao().readAll();
        Comment c1 = new Comment("1", "1", new Date(), tmpStudents.get(4).getFirstName(), "Nice job!", "1");
        Comment c2 = new Comment("2", "2", new Date(), tmpStudents.get(3).getFirstName(), "Nice job!", "1");
        Comment c3 = new Comment("3", "3", new Date(), tmpStudents.get(2).getFirstName(), "Nice job!", "1");
        Comment c4 = new Comment("4", "4", new Date(), tmpStudents.get(1).getFirstName(), "Nice job!", "1");
        Comment c5 = new Comment("5", "5", new Date(), tmpStudents.get(0).getFirstName(), "Nice job!", "1");
        tmpComments.add(c1);
        tmpComments.add(c2);
        tmpComments.add(c3);
        tmpComments.add(c4);
        tmpComments.add(c5);
        return tmpComments;
    }

    @Override
    public void update(Comment comment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Comment comment) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
