package com.example.scorpion.tabpageviewer1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by scorpion on 17/1/18.
 */

public class Adapter extends FragmentPagerAdapter {

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new SportFragment();
            case 1:return new TechnologyFragment();
            case 2:return new DesignFragment();
            case 3:return new PloliticsFragment();
            case 4:return new MovieFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Sports";
            case 1:return "Technologies";
            case 2:return "Design";
            case 3:return "Politics";
            case 4:return "Movies";
        }
        return super.getPageTitle(position);
    }

}
