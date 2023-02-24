package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseGameActivity extends AppCompatActivity {
    Button computerMode,playerMode ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_page);

        computerMode = findViewById(R.id.btn1);
        playerMode = findViewById(R.id.btn2);

        computerMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseGameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        playerMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseGameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
