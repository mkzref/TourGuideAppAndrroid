package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashMap extends AppCompatActivity {
    double Lat;
    double Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_map);

        Lat = getIntent().getDoubleExtra(getString(R.string.latitiude), 0.0);
        Log = getIntent().getDoubleExtra(getString(R.string.Longitiude), 0.0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashMap.this, MapsActivity.class);
                i.putExtra(getString(R.string.latitiude), Lat);
                i.putExtra(getString(R.string.Longitiude), Log);
                startActivity(i);
                finish();

            }
        }, 3000);
    }
}