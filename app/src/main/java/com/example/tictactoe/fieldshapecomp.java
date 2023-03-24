package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class fieldshapecomp extends AppCompatActivity {
    Button threeByThree,fourByFour, fiveByFive ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing_field_comp);

        threeByThree = findViewById(R.id.threeByThree);
        fourByFour = findViewById(R.id.fourByFour);
        fiveByFive = findViewById(R.id.fiveByFive);


        threeByThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldshapecomp.this, AddPlayerComp.class);
                startActivity(intent);
            }
        });
        fourByFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldshapecomp.this, AddPlayersOneComp.class);
                startActivity(intent);
            }
        });

        fiveByFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldshapecomp.this, AddPlayerTwoComp.class);
                startActivity(intent);
            }
        });
    }
}