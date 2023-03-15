package com.example.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class RandonnerActivity extends AppCompatActivity {
    TextView nomRando = (TextView) findViewById( R.id.nom_rendo );
    TextView dureeRando = (TextView) findViewById(R.id.duree_rendo);
    TextView descriptionRando = (TextView) findViewById(R.id.description_rendo);
    ImageView imageRando = (ImageView) findViewById(R.id.img_rendo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randonner);
        nomRando.setText("Randonnée au fil de l'eau");
        dureeRando.setText("2 heures");
        descriptionRando.setText("Rando dans les cévènnes");
        imageRando.setImageResource(R.drawable.rando);
    }

    public void onClickDecouvrir(View view) {
        Intent intent = new Intent(this, DecouvrirActivity.class);
        startActivity(intent);
        this.finish();

    }
}