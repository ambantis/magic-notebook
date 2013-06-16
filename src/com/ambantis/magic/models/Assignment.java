package com.ambantis.magic.models;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class Assignment implements Jsonable {
    private final String JSON_ID = "id";
    private final String JSON_TITLE = "title";
    private final String JSON_CREATE_DATE_TITLE = "createDate";
    private final String JSON_DUE_DATE_TITLE = "dueDate";

    private String mTitle;
    private String mId;
    private Date mCreateDate;
    private Date mDueDate;
    private final static Assignment nullAssignment = new Assignment(null,null,null,null);

    public static Assignment getNullAssignment() {
        return nullAssignment;
    }

    public Assignment(String mTitle, String mId, Date createDate, Date dueDate) {
        this.mTitle = mTitle;
        this.mId = mId;
        this.mCreateDate = mCreateDate;
        this.mDueDate = mDueDate;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public Date getCreateDate() {
        return mCreateDate;
    }

    public void setCreateDate(Date createDate) {
        this.mCreateDate = createDate;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    public void setDueDate(Date dueDate) {
        this.mDueDate = dueDate;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, mId);
        json.put(JSON_TITLE, mTitle);
        json.put(JSON_CREATE_DATE_TITLE, mCreateDate);
        json.put(JSON_DUE_DATE_TITLE, mDueDate);
        return json;
    }

    //    import java.util.UUID;
//    import org.json.JSONException;
//    import org.json.JSONObject;
//    @Override
//    public String toString() {
//        return mTitle;
//    }
//    public UUID getId() {
//        return mId;
//    }
//    private UUID mId;
//    public Assignment() {
//        mId = UUID.randomUUID();
//    }
//
//    public Assignment(JSONObject json) throws JSONException {
//        mId = UUID.fromString(json.getString(JSON_ID));
//        mTitle = json.getString(JSON_TITLE);
//    }
//
//    public JSONObject toJSON() throws JSONException {
//        JSONObject json = new JSONObject();
//        json.put(JSON_ID, mId.toString());
//        json.put(JSON_TITLE, mTitle);
//        return json;
//    }
}
