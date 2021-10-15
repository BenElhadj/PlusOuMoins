package com.samuelvialle.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
ImageView ivLoading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.ivLoading);

        imageView.animate()
                .alpha(1)
                .rotation(3600)
                .setDuration(2000)
                .translationY(-1400)
                .setDuration(3000)
                .withEndAction(new Runnable() {
            @Override
            public void run() {
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Splash.this,Accueil.class);
                        startActivity(intent);
                    }
                });
            }
        });

    }
}