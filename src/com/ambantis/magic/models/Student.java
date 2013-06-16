package com.ambantis.magic.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class Student {
    private ArrayList<Document> mDocuments;

    public Student(ArrayList<Document> mDocuments) {
        this.mDocuments = mDocuments;
    }

    public ArrayList<Document> getmDocuments() {
        return mDocuments;
    }

    public void setmDocuments(ArrayList<Document> mDocuments) {
        this.mDocuments = mDocuments;
    }
}
