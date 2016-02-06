package com.bignerdranch.android.criminalintent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by nirmalmadhunagarajan on 28/01/16.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab = new CrimeLab();
    private List<Crime> mCrimes = new ArrayList<>();

    private CrimeLab() {
        for (int i = 0; i < 20; i++) {
            Crime crime = new Crime("Crime # " + i, new Date(), i % 2 == 0);
            mCrimes.add(crime);

        }
    }

    public static CrimeLab getCrimeLab() {
        return sCrimeLab;
    }

    public static void setCrimeLab(CrimeLab crimeLab) {
        sCrimeLab = crimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID crimeId) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(crimeId)) {
                return crime;
            }
        }

        return null;
    }

    public void addCrime(Crime crime) {
        mCrimes.add(crime);
    }
}
