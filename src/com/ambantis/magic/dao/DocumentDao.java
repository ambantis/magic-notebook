package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Document;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:41 PM
 */
public interface DocumentDao {

    public void create(Document document) throws DaoException, DaoConnectionException;

    public Document read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Document> readAll() throws DaoException, DaoConnectionException;

    public void update(Document document) throws DaoException, DaoConnectionException;

    public void delete(Document document) throws DaoException, DaoConnectionException;

}
