package com.example.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class RandoActivity extends AppCompatActivity {
ArrayList<Rando> randos = new ArrayList<Rando>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rando);

        Rando rando1 = new Rando();
        rando1.nomRando = "Tour du lac Kir";
        rando1.distanceKm = 12;

        Rando rando2 = new Rando();
        rando2.nomRando = "Circuit des crêtes";
        rando2.distanceKm = 21;

        Rando rando3 = new Rando();
        rando3.nomRando = "Parcours de la chouette";
        rando3.distanceKm = 8;

        Rando rando4 = new Rando();
        rando4.nomRando = "Decouverte de Dijon";
        rando4.distanceKm = 30;

        Rando rando5 = new Rando();
        rando5.nomRando = "Rando n5";
        rando5.distanceKm = 5;

        randos.add(rando1);
        randos.add(rando2);
        randos.add(rando3);
        randos.add(rando4);
        randos.add(rando5);
    }

    class RandoAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return randos.size();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
    }
}