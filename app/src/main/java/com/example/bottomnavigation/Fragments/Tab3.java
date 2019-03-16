package com.example.bottomnavigation.Fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigation.R;


public class Tab3 extends Fragment {
    ViewPager pager;
    TabLayout tabLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_tab3, container, false);

        tabLayout=(TabLayout) view.findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Shows"));
        tabLayout.addTab((tabLayout.newTab().setText("Movies")));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        pager=(ViewPager) view.findViewById(R.id.pager);
        PagerAdapter pagerAdapter=new com.example.bottomnavigation.Adapters.PagerAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        pager.setAdapter(pagerAdapter);

        pager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

}
