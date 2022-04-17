package com.example.frag;

import android.app.FragmentManager;
import android.support.v4.os.IResultReceiver;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){

        super(fm);
        this.numOfTabs=numOfTabs;

    }

    public PagerAdapter(androidx.fragment.app.FragmentManager supportFragmentManager, int tabCount) {
        super();
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
