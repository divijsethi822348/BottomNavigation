package com.example.bottomnavigation.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.bottomnavigation.Fragments.MoviesFragment;
import com.example.bottomnavigation.Fragments.ShowsFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    int NoOfTabs;

    public PagerAdapter(FragmentManager fm,int NumberOfTabs) {

        super(fm);
        this.NoOfTabs=NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                ShowsFragment showsFragment=new ShowsFragment();
                return showsFragment;

            case 1:
                MoviesFragment moviesFragment=new MoviesFragment();
                return moviesFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
