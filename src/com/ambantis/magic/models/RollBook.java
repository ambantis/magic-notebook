package com.ambantis.magic.models;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class RollBook {
    private ArrayList<Period> mPeriods;
    private static RollBook mRollBook;

    private RollBook() {}

    public static RollBook getInstance() {
        if (mRollBook == null)
            mRollBook = new RollBook();
        return mRollBook;
    }

    public ArrayList<Period> getPeriods() {
        return mPeriods;
    }

    public void setPeriods(ArrayList<Period> mPeriods) {
        this.mPeriods = mPeriods;
    }
}
