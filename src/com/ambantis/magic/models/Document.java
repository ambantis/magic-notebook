package com.alex.assignments.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:40 AM
 */
public class Document {
    private Assignment assignment;
    private String mFileId; // FILE.id: String
    private String mTitle; // FILE.title: String
    private ArrayList<Student> owners; // FILE.ownerNames: List[]
    private ArrayList<Revision> revisions; // REVISIONS
}
