package com.ambantis.magic.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:40 AM
 */
public class Document {
    private Assignment mAssignment;

    /**
     * The ID of the file.
     * FILE.id : string
     */
    private String mId; // FILE.id: String

    /**
     * The title of the this file. Used to identify file or folder name.
     * FILE.title : string
     */
    private String mTitle; // FILE.title: String

    /**
     * Name(s) of the owner(s) of this file.
     * FILE.ownerNames = list[]
     * Note that the owner name should be mapped to the owner object
     * todo:2013-06-15:ambantis: need to map the owner name to the owner object
     */
    private ArrayList<Student> mOwners; // FILE.ownerNames: List[]


    private ArrayList<Revision> mRevisions; // REVISIONS

    private ArrayList<Comment> mComments;
}
