package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;


public class Winning extends Dialog {

    private final String message;
    private final fourOnFour mainActivity;

    public Winning(@NonNull Context context, String message, fourOnFour mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.win_dialog_layout2);
        final TextView messageText = findViewById(R.id.messageText);
        final Button startAgainButton = findViewById(R.id.startAgainButton);

        messageText.setText(message);
        startAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                mainActivity.restartMatch();
                dismiss();
            }
        });
    }
}