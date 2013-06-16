package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Assignment;
import com.ambantis.magic.models.Comment;
import com.ambantis.magic.models.Document;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:52 PM
 */
public class DocumentDaoMock implements DocumentDao {
    @Override
    public void create(Document document) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Document read(Integer id) throws DaoException, DaoConnectionException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayList<Document> readAll() throws DaoException, DaoConnectionException {
        DaoFactory dao = DaoFactory.getInstance();
        ArrayList<Assignment> tmpAssignments = dao.getAssignmentDao().readAll();
        ArrayList<Document> tmpDocuments = new ArrayList<Document>();
        Document d1 =
                new Document(tmpAssignments.get(0), "1", "M Summer Vacation", dao.getCommentDao().readAll());
        Document d2 =
                new Document(tmpAssignments.get(0), "2", "From Here to Eternity", dao.getCommentDao().readAll());
        Document d3 =
                new Document(tmpAssignments.get(0), "3", "Hablas Conmigo!", dao.getCommentDao().readAll());
        Document d4 =
                new Document(tmpAssignments.get(0), "4", "The Human Cell", dao.getCommentDao().readAll());
        Document d5 =
                new Document(tmpAssignments.get(0), "5", "How to Hack a Rasberry Pi", dao.getCommentDao().readAll());

        tmpDocuments.add(d1);
        tmpDocuments.add(d2);
        tmpDocuments.add(d3);
        tmpDocuments.add(d4);
        tmpDocuments.add(d5);
        return tmpDocuments;
    }

    @Override
    public void update(Document document) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Document document) throws DaoException, DaoConnectionException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
