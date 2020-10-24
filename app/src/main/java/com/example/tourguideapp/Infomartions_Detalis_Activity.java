package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Infomartions_Detalis_Activity extends AppCompatActivity {

    double Lat;
    double Log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomartions__detalis);
        Intent receiveIntent = this.getIntent();

        Lat = getIntent().getDoubleExtra(getString(R.string.latitiude), 0.0);
        Log = getIntent().getDoubleExtra(getString(R.string.Longitiude), 0.0);
        TextView loc = (TextView) findViewById(R.id.textView2);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Infomartions_Detalis_Activity.this, SplashMap.class);
                i.putExtra(getString(R.string.latitiude), Lat);
                i.putExtra(getString(R.string.Longitiude), Log);
                startActivity(i);
            }
        });

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        TextView textview = (TextView) findViewById(R.id.textView4);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt(getString(R.string.resouce));
            String text = bundle.getString(getString(R.string.information));
            textview.setText(text);
            image.setImageResource(resId);
        }


    }
}