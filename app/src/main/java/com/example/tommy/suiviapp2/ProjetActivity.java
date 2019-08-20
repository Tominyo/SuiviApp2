package com.example.tommy.suiviapp2;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjetActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ScrollView scrollView;
    private RecyclerView recyclerView;
    private CommitAdapter mAdapter;
    private List<Commit> projetsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projet);

        scrollView = findViewById(R.id.scrollview_main);

        TextView nomProjetTV = findViewById(R.id.textview_projet_name);
        String nomProjet = getIntent().getStringExtra(MainActivity.PROJET_NAME);
        nomProjetTV.setText(nomProjet);

        recyclerView = findViewById(R.id.recycler_view);

        for(int i = 0; i< 20; i++){
            projetsList.add(new Commit("Commit n°"+i, i,new Date()));
        }

        mAdapter = new CommitAdapter(this, projetsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.VERTICAL, 16));
        recyclerView.setAdapter(mAdapter);
    }

}
