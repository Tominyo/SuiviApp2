package com.example.tommy.suiviapp2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class CommitAdapter extends RecyclerView.Adapter<CommitAdapter.CommitViewHolder> {

    private Context context;
    private List<Commit> projetsList;
    private Date prevDate, currentDate;

    public class CommitViewHolder extends RecyclerView.ViewHolder {
        public TextView commitDateTV;
        public TextView commitMessageTV;

        public CommitViewHolder(View view) {
            super(view);
            commitDateTV = view.findViewById(R.id.textview_commit_date);
            commitMessageTV = view.findViewById(R.id.textview_commit_message);
            prevDate = new Date();
            currentDate = new Date();
        }
    }


    public CommitAdapter(Context context, List<Commit> projetsList) {
        this.context = context;
        this.projetsList = projetsList;
    }

    @Override
    public CommitAdapter.CommitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_commit, parent, false);

        return new CommitAdapter.CommitViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CommitAdapter.CommitViewHolder holder, int position) {
        Commit commit = projetsList.get(position);


        String dateTexte = DateFormat.getDateInstance().format(commit.getDate());
        holder.commitDateTV.setText(dateTexte);
        holder.commitMessageTV.setText(commit.getMessage());

    }

    @Override
    public int getItemCount() {
        return projetsList.size();
    }

}
