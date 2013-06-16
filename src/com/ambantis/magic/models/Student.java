package com.ambantis.magic.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class Student {
    private ArrayList<Document> mDocuments;
    private String firstName;
    private String lastName;
    private final static Student nullStudent = new Student(null,null,null);

    public Student getNullStudent() {
        return nullStudent;
    }

    public Student(ArrayList<Document> mDocuments, String firstName, String lastName) {
        this.mDocuments = mDocuments;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Document> getmDocuments() {
        return mDocuments;
    }

    public void setmDocuments(ArrayList<Document> mDocuments) {
        this.mDocuments = mDocuments;
    }
}
