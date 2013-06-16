package com.ambantis.magic.views;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.SearchViewCompat;
import android.support.v4.widget.SearchViewCompat.OnCloseListenerCompat;
import android.support.v4.widget.SearchViewCompat.OnQueryTextListenerCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ambantis.magic.R;
import com.ambantis.magic.models.Assignment;
import com.ambantis.magic.models.Period;
import com.ambantis.magic.models.RollBook;
import com.ambantis.magic.views.PeriodListFragment.Callbacks;

/**
 * A list fragment representing a list of Students. This fragment
 * also supports tablet devices by allowing list items to be given an
 * 'activated' state upon selection. This helps indicate which item is
 * currently being viewed in a {@linkPeriodDetailFragment}.
 * <p>
 * Activities containing this fragment MUST implement the {@link Callbacks}
 * interface.
 */

public class AssignmentListFragment extends ListFragment {
	private ArrayList<Assignment> mAssignments;
    private RollBook rb;
    private Period mPeriod;
    private int mIndex;
    public static final String INDEX_ID = "index_id";

	// This is the Adapter being used to display the list's data.
	AssignmentListAdapter mAdapter;

	// If non-null, this is the current filter the user has provided.
	String mCurFilter;

	OnQueryTextListenerCompat mOnQueryTextListenerCompat;
	
	

	@Override 
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		rb = RollBook.getInstance();
		

		mIndex = Integer.parseInt(getArguments().getString(INDEX_ID)) - 1;
        mPeriod = rb.getPeriods().get(mIndex);
		mAssignments = mPeriod.getmAssignments();
				

		// Give some text to display if there is no data.  In a real
		// application this would come from a resource.
		setEmptyText("No Assignments");

		// We have a menu item to show in action bar.
		setHasOptionsMenu(true);

		// Create an empty adapter we will use to display the loaded data
        mAdapter = new AssignmentListAdapter(mAssignments);
        // TODO: replace with a real list adapter.
		setListAdapter(mAdapter);
	}
/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.student_tab, container, false);
//        TextView tv = (TextView)findViewById(R.id.student_detail_container);
//           tv.setText("Hello World :)");
        return v;
    }
*/
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// Place an action bar item for searching.
		MenuItem item = menu.add("Search");
		item.setIcon(android.R.drawable.ic_menu_search);
		MenuItemCompat.setShowAsAction(item, MenuItemCompat.SHOW_AS_ACTION_IF_ROOM
				| MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		final View searchView = SearchViewCompat.newSearchView(getActivity());
		if (searchView != null) {
			SearchViewCompat.setOnQueryTextListener(searchView,
					new OnQueryTextListenerCompat() {
				@Override
				public boolean onQueryTextChange(String newText) {
					// Called when the action bar search text has changed.  Since this
					// is a simple array adapter, we can just have it do the filtering.
					mCurFilter = !TextUtils.isEmpty(newText) ? newText : null;
					mAdapter.getFilter().filter(mCurFilter);
					return true;
				}
			});
			SearchViewCompat.setOnCloseListener(searchView,
					new OnCloseListenerCompat() {
				@Override
				public boolean onClose() {
					if (!TextUtils.isEmpty(SearchViewCompat.getQuery(searchView))) {
						SearchViewCompat.setQuery(searchView, null, true);
					}
					return true;
				}

			});
			MenuItemCompat.setActionView(item, searchView);
		}
	}

	@Override public void onListItemClick(ListView l, View v, int position, long id) {
		// Insert desired behavior here.
		Log.i("LoaderCustom", "Item clicked: " + id);
	}
	
    private class AssignmentListAdapter extends ArrayAdapter<Assignment> {
        public AssignmentListAdapter(ArrayList<Assignment> assignments) {
            super(getActivity(), R.layout.list_item, assignments);
        }
    }
}


/*
public class StudentListFragment extends ListFragment {
	
	private ArrayList<Student> mStudents;
    private RollBook rb;
    public static final String INDEX_ID = "index_id";
    private int mIndex;
    private Period mPeriod;

    *//**
     * The serialization (saved instance state) Bundle key representing the
     * activated item position. Only used on tablets.
     *//*
    private static final String STATE_ACTIVATED_POSITION = "activated_position";
    
    *//**
     * The fragment's current callback object, which is notified of list item
     * clicks.
     *//*
    private Callbacks mCallbacks;

    *//**
     * The current activated item position. Only used on tablets.
     *//*
    private int mActivatedPosition = ListView.INVALID_POSITION;

    *//**
     * A callback interface that all activities containing this fragment must
     * implement. This mechanism allows activities to be notified of item
     * selections.
     *//*
    public interface Callbacks {
        *//**
         * Callback for when an item has been selected.
         *//*
        public void onItemSelected(Student student);
    }


    *//**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     *//*
    public StudentListFragment() {
    	rb = RollBook.getInstance();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int mIndex = Integer.parseInt(getArguments().getString(INDEX_ID));
        mPeriod = rb.getPeriods().get(mIndex);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Restore the previously serialized activated item position.
        if (savedInstanceState != null
                && savedInstanceState.containsKey(STATE_ACTIVATED_POSITION)) {
            setActivatedPosition(savedInstanceState.getInt(STATE_ACTIVATED_POSITION));
        }
        
        ArrayList<Student> mStudents = mPeriod.getmStudents();
        StudentAdapter adapter = new StudentAdapter(mStudents);
        // TODO: replace with a real list adapter.
        setListAdapter(adapter);
        setRetainInstance(true);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Activities containing this fragment must implement its callbacks.
        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        // Reset the active callbacks interface to the dummy implementation.
        mCallbacks = null;
    }
    
    public void updateUI() {
        ((StudentAdapter)getListAdapter()).notifyDataSetChanged();
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        
        Student s = ((StudentAdapter)getListAdapter()).getItem(position);

        // Notify the active callbacks interface (the activity, if the
        // fragment is attached to one) that an item has been selected.
        mCallbacks.onItemSelected(s);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mActivatedPosition != ListView.INVALID_POSITION) {
            // Serialize and persist the activated item position.
            outState.putInt(STATE_ACTIVATED_POSITION, mActivatedPosition);
        }
    }

    *//**
     * Turns on activate-on-click mode. When this mode is on, list items will be
     * given the 'activated' state when touched.
     *//*
    public void setActivateOnItemClick(boolean activateOnItemClick) {
        // When setting CHOICE_MODE_SINGLE, ListView will automatically
        // give items the 'activated' state when touched.
        getListView().setChoiceMode(activateOnItemClick
                ? ListView.CHOICE_MODE_SINGLE
                : ListView.CHOICE_MODE_NONE);
    }

    private void setActivatedPosition(int position) {
        if (position == ListView.INVALID_POSITION) {
            getListView().setItemChecked(mActivatedPosition, false);
        } else {
            getListView().setItemChecked(position, true);
        }

        mActivatedPosition = position;
    }
    
    private class StudentAdapter extends ArrayAdapter<Student> {
        public StudentAdapter(ArrayList<Student> students) {
            super(getActivity(), android.R.layout.simple_list_item_1, students);
        }
    }
}
*/