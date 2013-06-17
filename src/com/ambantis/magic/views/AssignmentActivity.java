package com.ambantis.magic.views;

import com.ambantis.magic.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class AssignmentActivity extends FragmentActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assignment);
		FragmentManager manager = getSupportFragmentManager();
		Fragment fragment = manager.findFragmentById(R.id.assignment_fragment_container);

		if (fragment == null) {
			fragment = new AssignmentFragment();
			manager.beginTransaction()
			.add(R.id.assignment_fragment_container, fragment)
			.commit();
		}
	}
	
}
