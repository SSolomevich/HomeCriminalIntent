package com.solomevich.android.homecriminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 15 on 02.02.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
protected Fragment createFragment() {
    return new CrimeListFragment();
}
}
