package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class fiveOnFive extends AppCompatActivity {
    private final List<int[]> combinationsList = new ArrayList<>();

    private int[] boxPositions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    private int playerTurn = 1;

    private int totalSelectedBoxes = 1;
    private TextView FirstPlayerName, SecondPlayerName;
    private LinearLayout FirstPlayerLayout, SecondPlayerLayout;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9,image10,image11, image12, image13, image14, image15, image16,image17,image18,image19,image20,image21,image22,image23,image24,image25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fiveonfive);
        combinationsList.add(new int[] {0, 1, 2, 3, 4});
        combinationsList.add(new int[] {5, 6, 7, 8, 9});
        combinationsList.add(new int[] {10, 11, 12, 13, 14});
        combinationsList.add(new int[] {15, 16, 17, 18, 19});
        combinationsList.add(new int[] {20, 21, 22, 23, 24});
        combinationsList.add(new int[] {0, 5, 10, 15, 20});
        combinationsList.add(new int[] {1, 6, 11, 16, 21});
        combinationsList.add(new int[] {2, 7, 12, 17, 22});
        combinationsList.add(new int[] {3, 8, 13, 18, 23});
        combinationsList.add(new int[] {4, 9, 14, 19, 24});
        combinationsList.add(new int[] {0, 6, 12, 18, 24});
        combinationsList.add(new int[] {4, 8, 12, 16, 20});


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
        image17 = findViewById(R.id.imageView17);
        image18 = findViewById(R.id.imageView18);
        image19 = findViewById(R.id.imageView19);
        image20 = findViewById(R.id.imageView20);
        image21 = findViewById(R.id.imageView21);
        image22 = findViewById(R.id.imageView22);
        image23 = findViewById(R.id.imageView23);
        image24 = findViewById(R.id.imageView24);
        image25 = findViewById(R.id.imageView25);


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
        image17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(16)) {
                    performAction((ImageView)v, 16);
                }
            }
        });

        image18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(17)) {
                    performAction((ImageView)v, 17);
                }
            }
        });

        image19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(18)) {
                    performAction((ImageView)v, 18);
                }
            }
        });

        image20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(19)) {
                    performAction((ImageView)v, 19);
                }
            }
        });

        image21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(20)) {
                    performAction((ImageView)v, 20);
                }
            }
        });

        image22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(21)) {
                    performAction((ImageView)v, 21);
                }
            }
        });

        image23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(22)) {
                    performAction((ImageView)v, 22);
                }
            }
        });

        image24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(23)) {
                    performAction((ImageView)v, 23);
                }
            }
        });

        image25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isBoxSelectable(24)) {
                    performAction((ImageView)v, 24);
                }
            }
        });


    }

    private void performAction(ImageView imageView, int selectedBoxPosition){
        boxPositions[selectedBoxPosition] = playerTurn;

        if(playerTurn == 1){
            imageView.setImageResource(R.drawable.cross);

            if(checkPlayerWin()){
                Winning5 winning5 = new Winning5(fiveOnFive.this, FirstPlayerName.getText().toString() + " " + "has won the match" , fiveOnFive.this);
                winning5.setCancelable(false);
                winning5.show();
            }
            else if(totalSelectedBoxes == 25){
                Winning5 winning5 = new Winning5(fiveOnFive.this, "It is a draw" , fiveOnFive.this);
                winning5.setCancelable(false);
                winning5.show();
            }
            else{
                changePlayerTurn(2);
                totalSelectedBoxes++;
            }

        }
        else{
            imageView.setImageResource(R.drawable.zero);

            if(checkPlayerWin()){
                Winning5 winning5 = new Winning5(fiveOnFive.this, SecondPlayerName.getText().toString() + " " + "has won the match" , fiveOnFive.this);
                winning5.setCancelable(false);
                winning5.show();
            }
            else if(selectedBoxPosition == 25){
                Winning5 winning5 = new Winning5(fiveOnFive.this, "It is a draw" , fiveOnFive.this);
                winning5.setCancelable(false);
                winning5.show();
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

            if(boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn && boxPositions[combination[2]] == playerTurn && boxPositions[combination[3]] == playerTurn && boxPositions[combination[4]] == playerTurn ){
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
        boxPositions = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

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
        image17.setImageResource(R.drawable.white);
        image18.setImageResource(R.drawable.white);
        image19.setImageResource(R.drawable.white);
        image20.setImageResource(R.drawable.white);
        image21.setImageResource(R.drawable.white);
        image22.setImageResource(R.drawable.white);
        image23.setImageResource(R.drawable.white);
        image24.setImageResource(R.drawable.white);
        image25.setImageResource(R.drawable.white);

    }
}
