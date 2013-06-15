package com.ambantis.magic.dao;

import com.ambantis.magic.exception.DaoConnectionException;
import com.ambantis.magic.exception.DaoException;
import com.ambantis.magic.models.Comment;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 2:39 PM
 */
public interface CommentDao {

    public void create(Comment comment) throws DaoException, DaoConnectionException;

    public Comment read(Integer id) throws DaoException, DaoConnectionException;

    public ArrayList<Comment> readAll() throws DaoException, DaoConnectionException;

    public void update(Comment comment) throws DaoException, DaoConnectionException;

    public void delete(Comment comment) throws DaoException, DaoConnectionException;

}
