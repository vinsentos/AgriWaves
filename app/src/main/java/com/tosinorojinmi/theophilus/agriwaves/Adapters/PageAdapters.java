package com.tosinorojinmi.theophilus.agriwaves.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tosinorojinmi.theophilus.agriwaves.Fragments.AllFragment;
import com.tosinorojinmi.theophilus.agriwaves.Fragments.CategoryFragment;

/**
 * Created by Theophilus on 8/13/2018.
 */

public class PageAdapters extends FragmentStatePagerAdapter {

    private int countTablayout;

    public PageAdapters(FragmentManager fm, int countTablayout) {
        super(fm);
        this.countTablayout = countTablayout;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                AllFragment fragment    = new AllFragment();
                return fragment;
//            case 1:
//                SeriesFragment seriesFragment   = new SeriesFragment();
//                return seriesFragment;
            case 1:
            CategoryFragment categoryFragment    = new CategoryFragment();
                return categoryFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countTablayout;
    }
}
