package com.bignerdranch.andriod.criminaiintent2;

import android.support.v4.app.Fragment;

/**
 * Created by A_S293 on 23/08/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
