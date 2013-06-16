package com.ambantis.magic.models;


import java.util.Date;

public class Assignment {
    private String mTitle;
    private String mId;
    private Date createDate;
    private Date dueDate;
    private final static Assignment nullAssignment = new Assignment(null,null,null,null);

    public Assignment getNullAssignment() {
        return nullAssignment;
    }

    public Assignment(String mTitle, String mId, Date createDate, Date dueDate) {
        this.mTitle = mTitle;
        this.mId = mId;
        this.createDate = createDate;
        this.dueDate = dueDate;
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
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
//    private static final String JSON_ID = "id";
//    private static final String JSON_TITLE = "title";
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
