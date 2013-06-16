package com.ambantis.magic.views;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.ambantis.magic.R;

public class AssignmentListActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_tab);

        FragmentManager fm = getSupportFragmentManager();

        // Create the list fragment and add it as our sole content.
        if (fm.findFragmentById(R.id.assignment_list) == null) {
            AssignmentListFragment list = new AssignmentListFragment();
            fm.beginTransaction().add(R.id.assignment_list, list).commit();
        }
    }
}