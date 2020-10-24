package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tourguideapp.Adapter.MyListAdapter;
import com.example.tourguideapp.classes.actions;

import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<actions> myListData = Arrays.asList(new actions(R.drawable.place1, getString(R.string.Places)),
                new actions(R.drawable.food, getString(R.string.Restaurants)),
                new actions(R.drawable.hotels, getString(R.string.Hotels)),
                new actions(R.drawable.events, getString(R.string.Events)),
                new actions(R.drawable.about, getString(R.string.About)));

        RecyclerView recyclerView = findViewById(R.id.rec);
        MyListAdapter adapter = new MyListAdapter(this, myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }


}