package com.example.bottomnavigation.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bottomnavigation.R;



public class Tab2 extends Fragment implements View.OnClickListener {


    TextView tab2;
    int count=0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_tab2, container, false);
        Button tab2button=(Button) view.findViewById(R.id.tab2button);
        tab2=(TextView) view.findViewById(R.id.tab2);
        tab2button.setOnClickListener(this);

        return view;
    }



    @Override
    public void onClick(View v) {
        count++;
        if (count % 2 != 0) {

            tab2.setText("Text Changed in second Tab Fragment only");

        }
        else{
            tab2.setText("This is second Tab Fragment");
        }
    }


}
