package com.example.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DecouvrirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decouvrir);
    }
    public void onClickRandonner(View view) {
        Intent intent = new Intent(this, RandonnerActivity.class);
        startActivity(intent);
        this.finish();
    }
}