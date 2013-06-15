package com.ambantis.magic.views;

import com.ambantis.magic.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.ambantis.magic.models.Assignment;


/**
 * An activity representing a list of Periods. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@linkPeriodDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link PeriodListFragment} and the item details
 * (if present) is a {@linkPeriodDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link PeriodListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class PeriodListActivity extends FragmentActivity
        implements PeriodListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_list);

        if (findViewById(R.id.period_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((PeriodListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.period_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link PeriodListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(Assignment assignment) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(PeriodDetailFragment.ARG_ITEM_ID, assignment.getId().toString());
            PeriodDetailFragment fragment = new PeriodDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.period_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, PeriodDetailActivity.class);
            detailIntent.putExtra(PeriodDetailFragment.ARG_ITEM_ID, assignment.getId());
            startActivity(detailIntent);
        }
    }
}
