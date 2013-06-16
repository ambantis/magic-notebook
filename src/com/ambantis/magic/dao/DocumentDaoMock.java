package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
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
        ArrayList<Document> tmpDocuments = new ArrayList<Document>();
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
