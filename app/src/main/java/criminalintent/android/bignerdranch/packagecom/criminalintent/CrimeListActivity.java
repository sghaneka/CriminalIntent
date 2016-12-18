package criminalintent.android.bignerdranch.packagecom.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by samgh on 12/6/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
