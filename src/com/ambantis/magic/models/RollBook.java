package com.ambantis.magic.models;

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
            Period p1 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "Physical Education",
                    "1"
            );
            Period p2 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "Algebra II",
                    "2"
            );
            Period p3 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "US History",
                    "3"
            );
            Period p4 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "Spanish",
                    "4"
            );
            Period p5 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "English",
                    "5"
            );
            Period p6 = new Period(
                    new ArrayList<Assignment>(),
                    new ArrayList<Student>(),
                    "Chemistry",
                    "6"
            );
            ArrayList<Period> tmpPeriods = new ArrayList<Period>();
            tmpPeriods.add(p1);
            tmpPeriods.add(p2);
            tmpPeriods.add(p3);
            tmpPeriods.add(p4);
            tmpPeriods.add(p5);
            tmpPeriods.add(p6);
            mRollBook.setPeriods(tmpPeriods);
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
