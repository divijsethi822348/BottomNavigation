package com.example.bottomnavigation.Activities;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigation.Fragments.Tab1;
import com.example.bottomnavigation.Fragments.Tab2;
import com.example.bottomnavigation.Fragments.Tab3;
import com.example.bottomnavigation.R;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomnav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SelectFragment(new Tab1());
        bottomnav=(BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment=null;

                switch (menuItem.getItemId()){
                    case R.id.nav_home:
//                        Tab1 tab1=new Tab1();
                        SelectFragment(new Tab1());
                        break;

                    case R.id.nav_search:
                        SelectFragment(new Tab2());
//                        selectedFragment=new Tab2();
                        break;

                    case R.id.nav_favourites:
                        SelectFragment(new Tab3());
//                        selectedFragment=new Tab3();
                        break;
                }

                return true;
            }
        });

    }

    private void SelectFragment(Fragment tab1) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,tab1);
        transaction.commit();
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,tab1);

    }

}
