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
}