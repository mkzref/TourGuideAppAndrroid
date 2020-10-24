package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tourguideapp.Adapter.PagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabbedActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish();
                Intent i = new Intent(TabbedActivity.this, Home.class);
                startActivity(i);
            }
        });

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);
        int pos = getIntent().getIntExtra(getString(R.string.tabs), 0);

        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab3));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab4));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab5));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(pos);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}