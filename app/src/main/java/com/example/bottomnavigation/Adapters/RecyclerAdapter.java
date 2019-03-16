package com.example.bottomnavigation.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bottomnavigation.ModelClasses.RecyclerModel;
import com.example.bottomnavigation.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<RecyclerModel> List;
    private Context context;

    public RecyclerAdapter(java.util.List<RecyclerModel> list, Context context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row,viewGroup,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        RecyclerModel model=List.get(i);
        myViewHolder.helloimage.setImageResource(model.getHelloimg());
        myViewHolder.hellotv.setText(model.getHello());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView hellotv;
        public ImageView helloimage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            helloimage=(ImageView) itemView.findViewById(R.id.helloimg);
            hellotv=(TextView) itemView.findViewById(R.id.hellotv);

        }
    }
}
