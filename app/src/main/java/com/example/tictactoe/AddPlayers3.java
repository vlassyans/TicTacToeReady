package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddPlayers3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players3);

        final EditText firstPlayer = findViewById(R.id.FirstPlayerName);
        final EditText secondPlayer = findViewById(R.id.SecondPlayerName);
        final Button startGameButton = findViewById(R.id.StartButton);


        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String getFirstPlayerName = firstPlayer.getText().toString();
                final String getSecondPlayerName = secondPlayer.getText().toString();

                if (getFirstPlayerName.isEmpty() || getSecondPlayerName.isEmpty()) {
                    Toast.makeText(AddPlayers3.this, "Enter player names", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(AddPlayers3.this, fiveOnFive.class);
                    intent.putExtra("firstPlayer", getFirstPlayerName);
                    intent.putExtra("secondPlayer", getSecondPlayerName);
                    startActivity(intent);

                }
            }
        });

    }


}