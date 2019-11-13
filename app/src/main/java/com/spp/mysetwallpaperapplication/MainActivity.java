package com.spp.mysetwallpaperapplication;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onclicksetwallpaper(View view) {
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setResource(R.drawable.images);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

