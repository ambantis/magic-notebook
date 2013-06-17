package com.ambantis.magic.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ambantis.magic.R;
import com.ambantis.magic.models.Student;


public class StudentFragment extends Fragment {
	public static final String STUDENT_ID = "student_id";
	private Student mStudent;
	private String mName;
	

	
	public static StudentFragment newInstance(String name) {
		Bundle args = new Bundle();
		args.putSerializable(STUDENT_ID, name);

		StudentFragment fragment = new StudentFragment();
		fragment.setArguments(args);

		return fragment;
	}

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student, parent, false);
        
        mName = getActivity().getIntent().getExtras().getString(STUDENT_ID);
        
        TextView tv = (TextView)v.findViewById(R.id.student_title);
        tv.setText(mName);
        tv.append("\n\n- Current assignments and progress");
        tv.append("\n\n- Grades");
        tv.append("\n\n- Aggregated assignment feedback");
        tv.append("\n\n- Weak spots and feedback");

       
        return v; 
    }
}
