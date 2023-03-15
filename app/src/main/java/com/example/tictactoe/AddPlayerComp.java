package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddPlayerComp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_player_comp);

        final EditText PlayerName = findViewById(R.id.NamePlayer);
        final Button startGame = findViewById(R.id.StartButtonComp);


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String getPlayerName = PlayerName.getText().toString();

                if (getPlayerName.isEmpty() ) {
                    Toast.makeText(AddPlayerComp.this, "Enter player name", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(AddPlayerComp.this, ComputerGameActivity.class);
                    intent.putExtra("PlayerName", getPlayerName);

                    startActivity(intent);

                }
            }
        });

    }


}
