package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class fourOnFour extends AppCompatActivity {
    private final List<int[]> combinationsList = new ArrayList<>();

    private int[] boxPositions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    private int playerTurn = 1;

    private int totalSelectedBoxes = 1;
    private TextView FirstPlayerName, SecondPlayerName;
    private LinearLayout FirstPlayerLayout, SecondPlayerLayout;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9,image10,image11, image12, image13, image14, image15, image16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fouronfour);
        combinationsList.add(new int[] {0, 1, 2, 3});
        combinationsList.add(new int[] {4, 5, 6, 7});
        combinationsList.add(new int[] {8, 9, 10, 11});
        combinationsList.add(new int[] {12, 13, 14, 15});
        combinationsList.add(new int[] {0, 4, 8, 12});
        combinationsList.add(new int[] {1, 5, 9, 13});
        combinationsList.add(new int[] {2, 6, 10, 14});
        combinationsList.add(new int[] {3, 7, 11, 15});
        combinationsList.add(new int[] {0, 5, 10, 15});
        combinationsList.add(new int[] {3, 6, 9, 12});

        image1 = findViewById(R.id.imageView1);
        image2 = findViewById(R.id.imageView2);
        image3 = findViewById(R.id.imageView3);
        image4 = findViewById(R.id.imageView4);
        image5 = findViewById(R.id.imageView5);
        image6 = findViewById(R.id.imageView6);
        image7 = findViewById(R.id.imageView7);
        image8 = findViewById(R.id.imageView8);
        image9 = findViewById(R.id.imageView9);
        image10 = findViewById(R.id.imageView10);
        image11 = findViewById(R.id.imageView11);
        image12 = findViewById(R.id.imageView12);
        image13 = findViewById(R.id.imageView13);
        image14= findViewById(R.id.imageView14);
        image15 = findViewById(R.id.imageView15);
        image16 = findViewById(R.id.imageView16);

        FirstPlayerName = findViewById(R.id.FirstPlayerName);
        SecondPlayerName = findViewById(R.id.SecondPlayerName);
        FirstPlayerLayout = findViewById(R.id.FirstPlayerLayout);
        SecondPlayerLayout = findViewById(R.id.SecondPlayerLayout);
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

        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(9)) {
                    performAction((ImageView)v, 9);
                }
            }
        });

        image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(10)) {
                    performAction((ImageView)v, 10);
                }
            }
        });
        image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(11)) {
                    performAction((ImageView)v, 11);
                }
            }
        });
        image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(12)) {
                    performAction((ImageView)v, 12);
                }
            }
        });
        image14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(13)) {
                    performAction((ImageView)v, 13);
                }
            }
        });
        image15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(14)) {
                    performAction((ImageView)v, 14);
                }
            }
        });
        image16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(15)) {
                    performAction((ImageView)v, 15);
                }
            }
        });

    }

    private void performAction(ImageView imageView, int selectedBoxPosition){
        boxPositions[selectedBoxPosition] = playerTurn;

        if(playerTurn == 1){
            imageView.setImageResource(R.drawable.cross);

            if(checkPlayerWin()){
                Winning winning = new Winning(fourOnFour.this, FirstPlayerName.getText().toString() + " " + "has won the match" , fourOnFour.this);
                winning.setCancelable(false);
                winning.show();
            }
            else if(totalSelectedBoxes == 16){
                Winning winning = new Winning(fourOnFour.this, "It is a draw" , fourOnFour.this);
                winning.setCancelable(false);
                winning.show();
            }
            else{
                changePlayerTurn(2);
                totalSelectedBoxes++;
            }

        }
        else{
            imageView.setImageResource(R.drawable.zero);

            if(checkPlayerWin()){
                Winning winning = new Winning(fourOnFour.this, SecondPlayerName.getText().toString() + " " + "has won the match" , fourOnFour.this);
                winning.setCancelable(false);
                winning.show();
            }
            else if(selectedBoxPosition == 16){
                Winning winning = new Winning(fourOnFour.this, "It is a draw" , fourOnFour.this);
                winning.setCancelable(false);
                winning.show();
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
            FirstPlayerLayout.setBackgroundResource(R.drawable.white);
            SecondPlayerLayout.setBackgroundResource(R.drawable.white);
        }
        else{
            SecondPlayerLayout.setBackgroundResource(R.drawable.white);
            FirstPlayerName.setBackgroundResource(R.drawable.white);
        }

    }

    private boolean checkPlayerWin(){
        boolean response = false;

        for(int i=0; i<combinationsList.size(); i++){
            final int [] combination = combinationsList.get(i);

            if(boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn && boxPositions[combination[2]] == playerTurn && boxPositions[combination[3]] == playerTurn){
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
        boxPositions = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

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
        image10.setImageResource(R.drawable.white);
        image11.setImageResource(R.drawable.white);
        image12.setImageResource(R.drawable.white);
        image13.setImageResource(R.drawable.white);
        image14.setImageResource(R.drawable.white);
        image15.setImageResource(R.drawable.white);
        image8.setImageResource(R.drawable.white);
        image16.setImageResource(R.drawable.white);

    }
}
