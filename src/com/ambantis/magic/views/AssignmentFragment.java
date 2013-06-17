package com.ambantis.magic.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ambantis.magic.R;
import com.ambantis.magic.models.Assignment;


public class AssignmentFragment extends Fragment {
	public static final String ASSIGNMENT_ID = "assignment_id";
	private Assignment mAssignment;
	private String mName;
	

	
	public static AssignmentFragment newInstance(String name) {
		Bundle args = new Bundle();
		args.putSerializable(ASSIGNMENT_ID, name);

		AssignmentFragment fragment = new AssignmentFragment();
		fragment.setArguments(args);

		return fragment;
	}

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_assignment, parent, false);
        
        mName = getActivity().getIntent().getExtras().getString(ASSIGNMENT_ID);
        
        TextView tv = (TextView)v.findViewById(R.id.assignment_title);
        tv.setText(mName);
        tv.append("\n\n- Due date");
        tv.append("\n\n- Assignment details/handout");
        tv.append("\n\n- Class progress");
        tv.append("\n\n- Document word counts");
        tv.append("\n\n- Document feedback/comments/help requests");
        
        
       
        return v; 
    }
}
