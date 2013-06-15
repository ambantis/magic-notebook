package com.alex.assignments.models;

import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

public class Assignment {

    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";

    private UUID mId;
    private String mTitle;

    public Assignment() {
        mId = UUID.randomUUID();
    }



    public Assignment(JSONObject json) throws JSONException {
        mId = UUID.fromString(json.getString(JSON_ID));
        mTitle = json.getString(JSON_TITLE);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, mId.toString());
        json.put(JSON_TITLE, mTitle);
        return json;
    }

    public void setTitle (String title) {
        mTitle = title;
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

}
