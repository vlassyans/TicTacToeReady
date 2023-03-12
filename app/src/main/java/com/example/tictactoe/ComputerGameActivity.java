package com.example.tictactoe;

import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
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

public class ComputerGameActivity extends AppCompatActivity {
    int activePlayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    boolean gameActive = true;
    ArrayList<String> emptySquares = new ArrayList<>();


    public void computer() {
        if (gameActive) {
            int select = emptySquares.size();
            int selected = new Random().nextInt(select);
            String selectedSquare = emptySquares.get(selected);

            switch (selectedSquare) {


                case "0":
                    ImageView imageView1 = findViewById(R.id.imageView1);
                    imageView1.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "1":
                    ImageView imageView2 = findViewById(R.id.imageView2);
                    imageView2.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "2":
                    ImageView imageView3 = findViewById(R.id.imageView3);
                    imageView3.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "3":
                    ImageView imageView4 = findViewById(R.id.imageView4);
                    imageView4.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "4":
                    ImageView imageView5 = findViewById(R.id.imageView5);
                    imageView5.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "5":
                    ImageView imageView6 = findViewById(R.id.imageView6);
                    imageView6.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "6":
                    ImageView imageView7 = findViewById(R.id.imageView7);
                    imageView7.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "7":
                    ImageView imageView8 = findViewById(R.id.imageView8);
                    imageView8.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;

                case "8":
                    ImageView imageView9 = findViewById(R.id.imageView9);
                    imageView9.setImageResource(R.drawable.cross);
                    activePlayer = 0;
                    emptySquares.remove(selectedSquare);
                    gameState[Integer.parseInt(selectedSquare)] = activePlayer;

                    break;
            }
            check();
        }

    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState[tappedCounter] == 2 && gameActive && emptySquares.contains(Integer.toString(tappedCounter))) {
            gameState[tappedCounter] = activePlayer;

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.zero);
                activePlayer = 1;
                emptySquares.remove(Integer.toString(tappedCounter));


                check();
                computer();
            }
        }
    }

    public void check(){
        for(int[] winningPosition : winningPositions){
            if(gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]]!=2){
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

            } else {
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
             ImageView counter = (ImageView) linearLayout.getChildAt(i);
             counter.setImageDrawable(null);
        }

      for(int i = 0; i<gameState.length; i++){
           gameState[i] = 2;
        }
         activePlayer = 0;
         gameActive = true;
     }


     @Override
     protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_computer_game);

        emptySquares.add("0");
         emptySquares.add("1");
       emptySquares.add("2");
         emptySquares.add("3");
         emptySquares.add("4");
         emptySquares.add("5");
         emptySquares.add("6");
         emptySquares.add("7");
         emptySquares.add("8");

     }
}







