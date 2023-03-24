package com.example.tictactoe;

import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class computerfiveonfive extends AppCompatActivity {
    int activePlayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {20, 21, 22, 23, 24}, {15, 16, 17, 18, 19}, {0, 5, 10, 15, 20}, {1, 6, 11, 16, 21},  {2, 7, 12, 17, 22}, {3, 8, 13, 18, 23},  {4, 9, 14, 19, 24}, {0, 6, 12, 18, 24}, {4, 8, 12, 16, 20}};
    boolean gameActive = true;
    ArrayList<String> emptySquares = new ArrayList<>();


    public void computer() {
        if (gameActive) {
            int select = emptySquares.size();
            int selected = new Random().nextInt(select);
            String selectedSquare = emptySquares.get(selected);
            gameState[Integer.parseInt(selectedSquare)] = activePlayer;
            activePlayer = 0;
            emptySquares.remove(selectedSquare);
            switch (selectedSquare) {


                case "0":
                    ImageView imageView1 = findViewById(R.id.imageView1);
                    imageView1.setImageResource(R.drawable.cross);
                    break;

                case "1":
                    ImageView imageView2 = findViewById(R.id.imageView2);
                    imageView2.setImageResource(R.drawable.cross);
                    break;

                case "2":
                    ImageView imageView3 = findViewById(R.id.imageView3);
                    imageView3.setImageResource(R.drawable.cross);
                    break;

                case "3":
                    ImageView imageView4 = findViewById(R.id.imageView4);
                    imageView4.setImageResource(R.drawable.cross);
                    break;

                case "4":
                    ImageView imageView5 = findViewById(R.id.imageView5);
                    imageView5.setImageResource(R.drawable.cross);
                    break;

                case "5":
                    ImageView imageView6 = findViewById(R.id.imageView6);
                    imageView6.setImageResource(R.drawable.cross);
                    break;

                case "6":
                    ImageView imageView7 = findViewById(R.id.imageView7);
                    imageView7.setImageResource(R.drawable.cross);
                    break;

                case "7":
                    ImageView imageView8 = findViewById(R.id.imageView8);
                    imageView8.setImageResource(R.drawable.cross);
                    break;

                case "8":
                    ImageView imageView9 = findViewById(R.id.imageView9);
                    imageView9.setImageResource(R.drawable.cross);
                    break;

                case "9":
                    ImageView imageView10 = findViewById(R.id.imageView10);
                    imageView10.setImageResource(R.drawable.cross);
                    break;

                case "10":
                    ImageView imageView11 = findViewById(R.id.imageView11);
                    imageView11.setImageResource(R.drawable.cross);
                    break;

                case "11":
                    ImageView imageView12 = findViewById(R.id.imageView12);
                    imageView12.setImageResource(R.drawable.cross);
                   break;

                case "12":
                    ImageView imageView13 = findViewById(R.id.imageView13);
                    imageView13.setImageResource(R.drawable.cross);

                    break;

                case "13":
                    ImageView imageView14 = findViewById(R.id.imageView14);
                    imageView14.setImageResource(R.drawable.cross);
                    break;

                case "14":
                    ImageView imageView15 = findViewById(R.id.imageView15);
                    imageView15.setImageResource(R.drawable.cross);
                    break;

                case "15":
                    ImageView imageView16 = findViewById(R.id.imageView16);
                    imageView16.setImageResource(R.drawable.cross);
                    break;

                case "16":
                    ImageView imageView17 = findViewById(R.id.imageView17);
                    imageView17.setImageResource(R.drawable.cross);
                    break;

                case "17":
                    ImageView imageView18 = findViewById(R.id.imageView18);
                    imageView18.setImageResource(R.drawable.cross);
                    break;

                case "18":
                    ImageView imageView19 = findViewById(R.id.imageView19);
                    imageView19.setImageResource(R.drawable.cross);
                    break;

                case "19":
                    ImageView imageView20 = findViewById(R.id.imageView20);
                    imageView20.setImageResource(R.drawable.cross);
                    break;

                case "20":
                    ImageView imageView21 = findViewById(R.id.imageView21);
                    imageView21.setImageResource(R.drawable.cross);
                    break;

                case "21":
                    ImageView imageView22 = findViewById(R.id.imageView22);
                    imageView22.setImageResource(R.drawable.cross);
                    break;

                case "22":
                    ImageView imageView23 = findViewById(R.id.imageView23);
                    imageView23.setImageResource(R.drawable.cross);
                    break;

                case "23":
                    ImageView imageView24 = findViewById(R.id.imageView24);
                    imageView24.setImageResource(R.drawable.cross);
                    break;

                case "24":
                    ImageView imageView25 = findViewById(R.id.imageView25);
                    imageView25.setImageResource(R.drawable.cross);
                    break;

            }
            check();
        }

    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        Log.i("dropcalled",tappedCounter+"");

        if (gameState[tappedCounter] == 2 && gameActive && emptySquares.contains(Integer.toString(tappedCounter))) {
            gameState[tappedCounter] = activePlayer;
            Log.i("dropcalled2","dropcalled2");

            gameState[tappedCounter] = activePlayer;
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.zero);
                activePlayer = 1;
                emptySquares.remove(Integer.toString(tappedCounter));


                check();
                computer();
            }
            else{
                counter.setImageResource(R.drawable.cross);
                activePlayer = 0;

            }
        }
    }

    public void check(){
        for(int[] winningPosition : winningPositions){
            if(gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[2]] == gameState[winningPosition[3]] && gameState[winningPosition[3]] == gameState[winningPosition[4]] && gameState[winningPosition[0]]!=2 && gameState[winningPosition[1]] != 2 && gameState[winningPosition[2]] != 2 && gameState[winningPosition[3]] != 2){
                gameActive = false;
                String winner = "";

                if(activePlayer == 1){
                    winner = "zero";

                }
                else{
                    winner = "cross";
                }

                Button playAgain = findViewById(R.id.PlayAgain2);
                TextView winnerTextView = findViewById(R.id.textView2);
                winnerTextView.setText("winner:" + winner);


                playAgain.setVisibility(View.VISIBLE);
                winnerTextView.setVisibility(View.VISIBLE);

            }else{
                Button playAgain = findViewById(R.id.PlayAgain2);
                playAgain.setVisibility(View.VISIBLE);
            }

        }

    }

    public void playAgain(View view) {
        Button playAgain = findViewById(R.id.PlayAgain2);
        TextView winnerTextView = findViewById(R.id.textView2);
        LinearLayout linearLayout = findViewById(R.id.container2);

        playAgain.setVisibility(View.INVISIBLE);
        winnerTextView.setVisibility(View.INVISIBLE);

        for(int i = 0; i < linearLayout.getChildCount(); i++){
            LinearLayout counter = (LinearLayout) linearLayout.getChildAt(i);

            for(int j = 0; j<counter.getChildCount(); j++){
                ImageView image = (ImageView) counter.getChildAt(j);
                image.setImageResource(R.drawable.white);

            }
        }

        for(int i = 0; i<gameState.length; i++){
            gameState[i] = 2;

        }
        emptySquares.clear();
        addTags();
        activePlayer = 0;
        gameActive = true;
    }
    public void addTags(){
        emptySquares.add("0");
        emptySquares.add("1");
        emptySquares.add("2");
        emptySquares.add("3");
        emptySquares.add("4");
        emptySquares.add("5");
        emptySquares.add("6");
        emptySquares.add("7");
        emptySquares.add("8");
        emptySquares.add("9");
        emptySquares.add("10");
        emptySquares.add("15");
        emptySquares.add("11");
        emptySquares.add("12");
        emptySquares.add("13");
        emptySquares.add("14");
        emptySquares.add("16");
        emptySquares.add("17");
        emptySquares.add("18");
        emptySquares.add("19");
        emptySquares.add("20");
        emptySquares.add("21");
        emptySquares.add("22");
        emptySquares.add("23");
        emptySquares.add("24");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comp_fiveonfive);
        addTags();
        TextView PlayerName;
        PlayerName = findViewById(R.id.PlayerName);
        final String getPlayerName = getIntent().getStringExtra("PlayerName");
        PlayerName.setText(getPlayerName);

    }
}

