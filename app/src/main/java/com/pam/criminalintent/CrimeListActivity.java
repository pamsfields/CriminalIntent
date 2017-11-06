package com.pam.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Pam on 10/14/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){

        return new CrimeListFragment();
    }
}
