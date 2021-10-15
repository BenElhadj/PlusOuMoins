package com.samuelvialle.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Connect3 extends AppCompatActivity {

    /** Méthode dropIn **/
public void dropIn (View view){
    ImageView square = (ImageView) view;
        square.setTranslationY((-1000));
        square.setImageResource(R.drawable.star_wars);
        square.animate().translationYBy(1000).rotation(1800).setDuration(500);
}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);
    }
}