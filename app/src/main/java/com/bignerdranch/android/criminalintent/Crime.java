package com.bignerdranch.android.criminalintent;


import java.util.Date;
import java.util.UUID;

/**
 * Created by nirmalmadhunagarajan on 23/12/15.
 */
public class Crime {

    private final UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public Crime(String title, Date crimeDate, boolean solved){
        this.mTitle = title;
        this.mDate = crimeDate;
        this.mSolved = solved;

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
