package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> myPokemon =new ArrayList<>();

        Pokemon p1 = new Pokemon("Bulbasaur ", R.drawable.bulbasaur, 49,49,318);
        Pokemon p2 = new Pokemon("ivysaur ", R.drawable.ivysaur, 62,63,405);
        Pokemon p3 = new Pokemon("Venusaur ", R.drawable.venusaur, 82,83,625);
        Pokemon p4 = new Pokemon("Charmander ", R.drawable.charmander, 52,43,309);

        myPokemon.add(p1);
        myPokemon.add(p2);
        myPokemon.add(p3);
        myPokemon.add(p4);


        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager ln =new LinearLayoutManager(this);
        rv.setLayoutManager(ln);


        MyAdapter adapter =new MyAdapter(myPokemon,this);
        rv.setAdapter(adapter);
    }
}
