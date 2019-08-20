package com.example.tommy.suiviapp2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<Projet> projetsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView projetName;
        public TextView projetState;

        public MyViewHolder(View view) {
            super(view);
            projetName = view.findViewById(R.id.textview_projet_name);
            projetState = view.findViewById(R.id.textview_projet_state);
        }
    }


    public MyAdapter(Context context, List<Projet> projetsList) {
        this.context = context;
        this.projetsList = projetsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Projet projet = projetsList.get(position);

        holder.projetName.setText(projet.getName());
        holder.projetState.setText(projet.getState());
    }

    @Override
    public int getItemCount() {
        return projetsList.size();
    }

}