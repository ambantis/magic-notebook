package com.ambantis.magic.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:54 AM
 */
public class Revision implements Jsonable {

    private static final Revision nullRevision = new Revision(null,null,null,null);

    public Revision getNullRevision() {
        return nullRevision;
    }

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

    public Revision(String mId, Date mModifiedDate, String mPublishedLink, String mLastModifyingUserName) {
        this.mId = mId;
        this.mModifiedDate = mModifiedDate;
        this.mPublishedLink = mPublishedLink;
        this.mLastModifyingUserName = mLastModifyingUserName;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public Date getmModifiedDate() {
        return mModifiedDate;
    }

    public void setmModifiedDate(Date mModifiedDate) {
        this.mModifiedDate = mModifiedDate;
    }

    public String getmPublishedLink() {
        return mPublishedLink;
    }

    public void setmPublishedLink(String mPublishedLink) {
        this.mPublishedLink = mPublishedLink;
    }

    public String getmLastModifyingUserName() {
        return mLastModifyingUserName;
    }

    public void setmLastModifyingUserName(String mLastModifyingUserName) {
        this.mLastModifyingUserName = mLastModifyingUserName;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
