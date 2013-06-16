package com.ambantis.magic.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class Period {
    private ArrayList<Assignment> mAssignments;
    private ArrayList<Student> mStudents;

    public Period(ArrayList<Assignment> mAssignments, ArrayList<Student> mStudents) {
        this.mAssignments = mAssignments;
        this.mStudents = mStudents;
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
}
