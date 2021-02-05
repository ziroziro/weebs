package com.ziro.weebs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView staggeredRv;
    private StaggredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        //List
        List<Row> lst = new ArrayList<>();
        lst.add(new Row(R.drawable.place1));
        lst.add(new Row(R.drawable.place2));
        lst.add(new Row(R.drawable.place3));
        lst.add(new Row(R.drawable.place4));
        lst.add(new Row(R.drawable.place5));
        lst.add(new Row(R.drawable.place6));
        lst.add(new Row(R.drawable.place7));
        lst.add(new Row(R.drawable.place8));
        lst.add(new Row(R.drawable.place9));
        lst.add(new Row(R.drawable.place10));
        lst.add(new Row(R.drawable.place14));
        lst.add(new Row(R.drawable.place1));
        lst.add(new Row(R.drawable.place2));
        lst.add(new Row(R.drawable.place3));
        lst.add(new Row(R.drawable.place4));
        lst.add(new Row(R.drawable.place5));
        lst.add(new Row(R.drawable.place6));
        lst.add(new Row(R.drawable.place7));
        lst.add(new Row(R.drawable.place8));
        lst.add(new Row(R.drawable.place9));
        lst.add(new Row(R.drawable.place10));
        lst.add(new Row(R.drawable.place11));
        lst.add(new Row(R.drawable.place12));
        lst.add(new Row(R.drawable.place13));
        lst.add(new Row(R.drawable.place14));
        lst.add(new Row(R.drawable.place1));
        lst.add(new Row(R.drawable.place2));
        lst.add(new Row(R.drawable.place3));
        lst.add(new Row(R.drawable.place4));
        lst.add(new Row(R.drawable.place5));
        lst.add(new Row(R.drawable.place6));


        adapter = new StaggredRecyclerAdapter(this, lst);
        staggeredRv.setAdapter(adapter);
    }
}