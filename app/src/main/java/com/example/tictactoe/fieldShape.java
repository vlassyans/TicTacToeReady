package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class fieldShape extends AppCompatActivity {
    Button threeByThree,fourByFour, fiveByFive ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing_field_2mode);

        threeByThree = findViewById(R.id.threeByThree);
        fourByFour = findViewById(R.id.fourByFour);
        fiveByFive = findViewById(R.id.fiveByFive);


        threeByThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldShape.this, AddPlayers1.class);
                startActivity(intent);
            }
        });
        fourByFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldShape.this, AddPlayers2.class);
                startActivity(intent);
            }
        });

        fiveByFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fieldShape.this, AddPlayers3.class);
                startActivity(intent);
            }
        });
    }
}