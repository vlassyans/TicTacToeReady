package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonComp extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView textView5;
    String[][] cros ={{"","",""}, {"","",""}, {"","",""}};
    String icon1, icon2;
    int m,k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_computer);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        icon1="X";
        icon2="O";

    }

    public void step1(View v){
        cros[0][0] = icon1;
        button1.setText(icon1);
        button1.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step2(View v){
        cros[0][1] = icon1;
        button2.setText(icon1);
        button2.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step3(View v){
        cros[0][2] = icon1;
        button3.setText(icon1);
        button3.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step4(View v){
        cros[1][0] = icon1;
        button4.setText(icon1);
        button4.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step5(View v){
        cros[1][1] = icon1;
        button5.setText(icon1);
        button5.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step6(View v){
        cros[1][2] = icon1;
        button6.setText(icon1);
        button6.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step7(View v){
        cros[2][0] = icon1;
        button7.setText(icon1);
        button7.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step8(View v){
        cros[2][1] = icon1;
        button8.setText(icon1);
        button8.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void step9(View v){
        cros[2][2] = icon1;
        button9.setText(icon1);
        button9.setEnabled(false);
        check();
        look();
        diverseStep();
    }
    public void comp(){
        m = (int)(0 +(Math.random()*3));
        k = (int)(0 +(Math.random()*3));
    }

    public void diverseStep(){
        comp();
        if(cros[m][k].equals("X")|| cros[m][k].equals("O")){
            comp();
        }

        cros[m][k]=icon2;

        onStart();
        check();
        look();
    }

    public void look(){
        button1.setText(cros[0][0]);
        button2.setText(cros[0][1]);
        button3.setText(cros[0][2]);
        button4.setText(cros[1][0]);
        button5.setText(cros[1][1]);
        button6.setText(cros[1][2]);
        button7.setText(cros[2][0]);
        button8.setText(cros[2][1]);
        button9.setText(cros[2][2]);
    }

    public void check(){
        if((button1.getText().equals("X")) && (button2.getText().equals("X")) && (button3.getText().equals("X"))){
    textView5.setText("Player Won");
        }
        if((button1.getText().equals("X")) && (button4.getText().equals("X")) && (button7.getText().equals("X"))){
            textView5.setText("Player Won");
        }

        if((button1.getText().equals("X")) && (button5.getText().equals("X")) && (button9.getText().equals("X"))){
            textView5.setText("Player Won");
        }
    }
}
