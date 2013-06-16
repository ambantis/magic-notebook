/*
package com.ambantis.magic.views;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;
import android.util.Log;
import com.ambantis.magic.dao.AssignmentJSONSerializer;
import com.ambantis.magic.models.Assignment;
*/
/*
public class AssignmentHandler {
    private static final String TAG = "AssignmentHandler";
    private static final String FILENAME = "assignments.json";

    private ArrayList<Assignment> mAssignments;
    private AssignmentJSONSerializer mSerializer;

    private static AssignmentHandler sAssignmentHandler;
    private Context mAppContext;

    private AssignmentHandler(Context appContext) {
        mAppContext = appContext;
        mSerializer = new AssignmentJSONSerializer(mAppContext, FILENAME);

        
        try {
            mAssignments = mSerializer.loadAssignments();
        } catch (Exception e) {
            mAssignments = new ArrayList<Assignment>();
            Log.e(TAG, "Error loading assignments: ", e);
        }
       
        
        mAssignments = new ArrayList<Assignment>();
        
        for (int i = 1; i <7; i++) {
        	Assignment a = new Assignment();
        	a.setTitle("Period " + i);
        	mAssignments.add(a);
        }
    }

    public static AssignmentHandler get(Context c) {
        if (sAssignmentHandler == null) {
            sAssignmentHandler = new AssignmentHandler(c.getApplicationContext());
        }
        return sAssignmentHandler;
    }

    public Assignment getAssignment(UUID id) {
        for (Assignment a : mAssignments) {
            if (a.getId().equals(id))
                return a;
        }
        return null;
    }
    
    public void addCrime(Assignment a) {
        mAssignments.add(a);
        saveCrimes();
    }

    public ArrayList<Assignment> getAssignments() {
        return mAssignments;
    }

    public boolean saveCrimes() {
        try {
            mSerializer.saveAssignments(mAssignments);
            Log.d(TAG, "Assignments saved to file");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error saving assignments: " + e);
            return false;
        }
    }
} 
*/