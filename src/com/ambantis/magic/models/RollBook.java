package com.ambantis.magic.models;

import com.ambantis.magic.dao.DaoFactory;
import com.ambantis.magic.exception.DaoConnectionException;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 11:31 AM
 */
public class RollBook implements Jsonable {
    private ArrayList<Period> mPeriods;
    private static RollBook mRollBook;

    private RollBook() {}

    public static RollBook getInstance() {
        if (mRollBook == null) {
            mRollBook = new RollBook();
            try {
                mRollBook.setPeriods(DaoFactory.getInstance().getPeriodDao().readAll());
            } catch (DaoConnectionException e) {
                e.printStackTrace();
            }
        }
        return mRollBook;
    }

    public ArrayList<Period> getPeriods() {
        return mPeriods;
    }

    public void setPeriods(ArrayList<Period> mPeriods) {
        this.mPeriods = mPeriods;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
