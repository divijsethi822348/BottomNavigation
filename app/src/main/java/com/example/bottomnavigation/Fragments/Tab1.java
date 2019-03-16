package com.example.bottomnavigation.Fragments;




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigation.Adapters.RecyclerAdapter;
import com.example.bottomnavigation.ModelClasses.RecyclerModel;
import com.example.bottomnavigation.R;


import java.util.ArrayList;
import java.util.List;


public class Tab1 extends Fragment {
    public RecyclerView recyclertab1;
    private List<RecyclerModel> list=new ArrayList<>();
    public RecyclerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab1, container, false);

        recyclertab1=(RecyclerView) view.findViewById(R.id.recyclertab1);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclertab1.setLayoutManager(layoutManager);

        RecyclerModel model=new RecyclerModel(R.drawable.call,"Hello");
        list.add(model);

        for(int i=0;i<30;i++){
            model=new RecyclerModel(R.drawable.call,"Hello");
            list.add(model);
        }


        adapter=new RecyclerAdapter(list,getActivity());
        recyclertab1.setAdapter(adapter);



        return view;
    }


}
