package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<int[]> combinationsList = new ArrayList<>();

    private int [] boxPositions = {0,0,0,0,0,0,0,0,0};

    private int playerTurn = 1;

    private int totalSelectedBoxes = 1;

    private LinearLayout FirstPlayerLayout, SecondPlayerLayout;
    private TextView FirstPlayerName, SecondPlayerName;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstPlayerName = findViewById(R.id.FirstPlayerName);
        SecondPlayerName = findViewById(R.id.SecondPlayerName);

        FirstPlayerLayout = findViewById(R.id.FirstPlayerLayout);
        SecondPlayerLayout = findViewById(R.id.SecondPlayerLayout);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        combinationsList.add(new int[] {0, 1, 2});
        combinationsList.add(new int[] {3, 4, 5});
        combinationsList.add(new int[] {6, 7, 8});
        combinationsList.add(new int[] {0, 3, 6});
        combinationsList.add(new int[] {1, 4, 7});
        combinationsList.add(new int[] {2, 5, 8});
        combinationsList.add(new int[] {2, 4, 6});
        combinationsList.add(new int[] {0, 4, 8});

        final String getFirstPlayerName = getIntent().getStringExtra("firstPlayer");
        final String getSecondPlayerName = getIntent().getStringExtra("secondPlayer");

        FirstPlayerName.setText(getFirstPlayerName);
        SecondPlayerName.setText(getSecondPlayerName);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(0)) {
                    performAction((ImageView)v, 0);
                }
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(1)) {
                    performAction((ImageView)v, 1);
                }
                }


        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(2)) {
                    performAction((ImageView)v, 2);
                }

            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(3)){
                    performAction((ImageView)v, 3);
                }

            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(4)){
                    performAction((ImageView)v, 4);
                }

            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if(isBoxSelectable(5)){
              performAction((ImageView)v, 5);
          }
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(6)) {
                    performAction((ImageView)v, 6);
                }

            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(7)){
                    performAction((ImageView)v, 7);
                }

            }
        });

        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelectable(8)){
      performAction((ImageView)v, 8);
                }

            }
        });

    }

    private void performAction(ImageView imageView, int selectedBoxPosition){
        boxPositions[selectedBoxPosition] = playerTurn;

        if(playerTurn == 1){
            imageView.setImageResource(R.drawable.cross);

            if(checkPlayerWin()){
                WinDialog winDialog = new WinDialog(MainActivity.this, "Congrats!!" + " " + FirstPlayerName.getText().toString() + " " + "has won the match" , MainActivity.this);
               winDialog.setCancelable(false);
                winDialog.show();
            }
            else if(totalSelectedBoxes == 9){
                WinDialog winDialog = new WinDialog(MainActivity.this, "It is a draw" , MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.show();
            }
            else{
                changePlayerTurn(2);
                totalSelectedBoxes++;
            }

        }
        else{
            imageView.setImageResource(R.drawable.zero);

            if(checkPlayerWin()){
                WinDialog winDialog = new WinDialog(MainActivity.this, " Congrats!!" + " " + SecondPlayerName.getText().toString() + " " + "has won the match" , MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.show();
            }
            else if(selectedBoxPosition == 9){
                WinDialog winDialog = new WinDialog(MainActivity.this, "It is a draw" , MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.show();
            }
            else{
             changePlayerTurn(1);
             totalSelectedBoxes++;
            }
        }
    }

    private void changePlayerTurn(int currentPlayerName){
        playerTurn = currentPlayerName;

        if(playerTurn == 1){
            FirstPlayerLayout.setBackgroundResource(R.drawable.pinky);
            SecondPlayerLayout.setBackgroundResource(R.drawable.pinky);
        }
        else{
            SecondPlayerLayout.setBackgroundResource(R.drawable.pinky);
            FirstPlayerName.setBackgroundResource(R.drawable.pinky);
        }

    }

    private boolean checkPlayerWin(){
        boolean response = false;

        for(int i=0; i<combinationsList.size(); i++){
            final int [] combination = combinationsList.get(i);

            if(boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn && boxPositions[combination[2]] == playerTurn){
                response = true;
            }
        }
        return response;
    }

    private boolean isBoxSelectable(int boxPosition) {
        boolean response = false;

        if (boxPositions[boxPosition] == 0) {
            response = true;
        }
        return response;
    }
public void restartMatch(){
        boxPositions = new int[]{0,0,0,0,0,0,0,0,0};

        playerTurn = 1;
        totalSelectedBoxes = 1;
        image9.setImageResource(R.drawable.white);
    image1.setImageResource(R.drawable.white);
    image2.setImageResource(R.drawable.white);
    image3.setImageResource(R.drawable.white);
    image4.setImageResource(R.drawable.white);
    image5.setImageResource(R.drawable.white);
    image6.setImageResource(R.drawable.white);
    image7.setImageResource(R.drawable.white);
    image8.setImageResource(R.drawable.white);
}
}

