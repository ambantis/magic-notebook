package com.ambantis.magic.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class Period implements Jsonable {
    private ArrayList<Assignment> mAssignments;
    private ArrayList<Student> mStudents;
    private String mSubject;
    private String mId;

    private final Period nullPeriod = new Period(null,null,null,null);

    public Period getNullPeriod() {
        return nullPeriod;
    }

    public Period(ArrayList<Assignment> mAssignments, ArrayList<Student> mStudents, String mSubject, String mId) {
        this.mAssignments = mAssignments;
        this.mStudents = mStudents;
        this.mSubject = mSubject;
        this.mId = mId;
    }

    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public ArrayList<Assignment> getmAssignments() {
        return mAssignments;
    }

    public void setmAssignments(ArrayList<Assignment> mAssignments) {
        this.mAssignments = mAssignments;
    }

    public ArrayList<Student> getmStudents() {
        return mStudents;
    }

    public void setmStudents(ArrayList<Student> mStudents) {
        this.mStudents = mStudents;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
