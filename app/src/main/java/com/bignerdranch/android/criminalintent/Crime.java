package com.bignerdranch.android.criminalintent;


import java.util.UUID;

/**
 * Created by nirmalmadhunagarajan on 23/12/15.
 */
public class Crime {

    private final UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
