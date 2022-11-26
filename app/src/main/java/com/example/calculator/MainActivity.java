package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble((String) display.getText());
        display.setText("");
    }

    public void onClickZero(View view) {
        Button buttonZero = findViewById(R.id.buttonZero);
        String btnZeroText = (String) display.getText() + buttonZero.getText();
        display.setText(btnZeroText);
    }

    public void onClickOne(View view) {
        Button buttonOne = findViewById(R.id.buttonOne);
        String btnOneText = (String) display.getText() + buttonOne.getText();
        display.setText(btnOneText);
    }

    public void onClickTwo(View view) {
        Button buttonTwo = findViewById(R.id.buttonTwo);
        String btnTwoText = (String) display.getText() + buttonTwo.getText();
        display.setText(btnTwoText);
    }

    public void onClickThree(View view) {
        Button buttonThree = findViewById(R.id.buttonThree);
        String btnThreeText = (String) display.getText() + buttonThree.getText();
        display.setText(btnThreeText);
    }

    public void onClickFour(View view) {
        Button buttonFour = findViewById(R.id.buttonFour);
        String btnFourText = (String) display.getText() + buttonFour.getText();
        display.setText(btnFourText);
    }

    public void onClickFive(View view) {
        Button buttonFive = findViewById(R.id.buttonFive);
        String btnFiveText = (String) display.getText() + buttonFive.getText();
        display.setText(btnFiveText);
    }

    public void onClickSix(View view) {
        Button buttonSix = findViewById(R.id.buttonSix);
        String btnSixText = (String) display.getText() + buttonSix.getText();
        display.setText(btnSixText);
    }

    public void onClickSeven(View view) {
        Button buttonSeven = findViewById(R.id.buttonSeven);
        String btnSevenText = (String) display.getText() + buttonSeven.getText();
        display.setText(btnSevenText);
    }

    public void onClickEight(View view) {
        Button buttonEight = findViewById(R.id.buttonEight);
        String btnEightText = (String) display.getText() + buttonEight.getText();
        display.setText(btnEightText);
    }

    public void onClickNine(View view) {
        Button buttonNine = findViewById(R.id.buttonNine);
        String btnNineText = (String) display.getText() + buttonNine.getText();
        display.setText(btnNineText);
    }
}