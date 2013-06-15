package com.alex.assignments.models;

import java.util.Date;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:54 AM
 */
public class Revision {

    /**
     * The document id
     * REVISION.id : string
     */
    private String mId;

    /**
     * Last time this revision was modified (formatted RFC 3339 timestamp).
     * REVISION.modifiedDate : datetime
     */
    private Date mModifiedDate;

    /**
     * A link to the published revision.
     * REVISION.publishedLink : string
     */
    private String mPublishedLink;


    /**
     * Name of the last user to modify this revision.
     * REVISION.lastModifyingUserName : string
     */
    private String mLastModifyingUserName;

}
