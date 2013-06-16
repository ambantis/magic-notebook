package com.ambantis.magic.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambantis.magic.R;
import com.ambantis.magic.models.Period;
import com.ambantis.magic.models.RollBook;
//import com.ambantis.magic.R;

/**
 * A fragment representing a single Period detail screen.
 * This fragment is either contained in a {@link PeriodListActivity}
 * in two-pane mode (on tablets) or a {@link PeriodDetailActivity}
 * on handsets.
 */

public class PeriodDetailFragment extends Fragment {
    private FragmentTabHost mTabHost;
    private RollBook rb;
    private Period mPeriod;
    
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";
    private String mIndex;

    
    public PeriodDetailFragment() {
    	rb = RollBook.getInstance();
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
        	
        	//Get the period by ARG_ITEM_ID
        
        	mIndex = getArguments().getString(ARG_ITEM_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        mTabHost = new FragmentTabHost(getActivity());
        
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.period_detail_container);
        
        Bundle arguments = new Bundle();
        arguments.putString(StudentListFragment.INDEX_ID, mIndex);
        
        mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"),
                FragmentStackSupport.CountingFragment.class, arguments);
        mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("Contacts"),
                LoaderCursorSupport.CursorLoaderListFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator("Custom"),
                LoaderCustomSupport.AppListFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("throttle").setIndicator("Throttle"),
                LoaderThrottleSupport.ThrottledLoaderListFragment.class, null);

        return mTabHost;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTabHost = null;
    }
}

