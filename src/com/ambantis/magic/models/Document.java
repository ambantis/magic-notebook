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

    public Document(Assignment mAssignment, String mId, String mTitle, ArrayList<Student> mOwners,
                    ArrayList<Revision> mRevisions, ArrayList<Comment> mComments) {
        this.mAssignment = mAssignment;
        this.mId = mId;
        this.mTitle = mTitle;
        this.mOwners = mOwners;
        this.mRevisions = mRevisions;
        this.mComments = mComments;
    }

    public Assignment getmAssignment() {
        return mAssignment;
    }

    public void setmAssignment(Assignment mAssignment) {
        this.mAssignment = mAssignment;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public ArrayList<Student> getmOwners() {
        return mOwners;
    }

    public void setmOwners(ArrayList<Student> mOwners) {
        this.mOwners = mOwners;
    }

    public ArrayList<Revision> getmRevisions() {
        return mRevisions;
    }

    public void setmRevisions(ArrayList<Revision> mRevisions) {
        this.mRevisions = mRevisions;
    }

    public ArrayList<Comment> getmComments() {
        return mComments;
    }

    public void setmComments(ArrayList<Comment> mComments) {
        this.mComments = mComments;
    }
}
