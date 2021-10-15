package com.samuelvialle.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {

    /**1 Variable global**/
    Button btnPlusOuMoins;

    /**2 Méthode init() **/
    public void init(){
        btnPlusOuMoins = findViewById(R.id.btnPlusOuMoins);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        /**3 Appel de la méthode init **/
        init();

        btnPlusOuMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Création de l'Intent
                Intent intent = new Intent(Accueil.this, PlusOuMoins.class);

                String titre = btnPlusOuMoins.getText().toString();
                intent.putExtra("TitrePage", titre);
                // lancement de l'activité PlusOuMoins
                startActivity(intent);
            }
        });

    }
}