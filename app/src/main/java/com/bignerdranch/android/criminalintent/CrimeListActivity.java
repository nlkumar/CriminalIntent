package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by nirmalmadhunagarajan on 05/02/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}
