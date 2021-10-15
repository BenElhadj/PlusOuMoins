package com.samuelvialle.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        ImageView imageView = findViewById(R.id.ivLoading);

        imageView.animate().alpha(1).rotation(6300).setDuration(2000);
    }
}