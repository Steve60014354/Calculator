package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private int stage = 0;
    TextView display;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("stage", stage);
        savedInstanceState.putDouble("total1", total1);
        savedInstanceState.putDouble("total2", total2);
        savedInstanceState.putChar("math_operator", math_operator);
        savedInstanceState.putString("display", (String) display.getText());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        if (savedInstanceState !=null) {
            stage = savedInstanceState.getInt("stage");
            total2 = savedInstanceState.getDouble("total2");
            total1 = savedInstanceState.getDouble("total1");
            math_operator = savedInstanceState.getChar("math_operator");
            display.setText(savedInstanceState.getString("display"));
        }
    }

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        if (Objects.equals((String) display.getText(), "")) {
            total1 = 0;
        }
        else {
            total1 = Double.parseDouble((String) display.getText());
        }
        display.setText("");
    }

    public void onClickZero(View view) {
        if (stage != 2) {
            Button buttonZero = findViewById(R.id.buttonZero);
            String btnZeroText = (String) display.getText() + buttonZero.getText();
            display.setText(btnZeroText);
        }
    }

    public void onClickOne(View view) {
        if (stage != 2) {
            Button buttonOne = findViewById(R.id.buttonOne);
            String btnOneText = (String) display.getText() + buttonOne.getText();
            display.setText(btnOneText);
        }
    }

    public void onClickTwo(View view) {
        if (stage != 2) {
            Button buttonTwo = findViewById(R.id.buttonTwo);
            String btnTwoText = (String) display.getText() + buttonTwo.getText();
            display.setText(btnTwoText);
        }
    }

    public void onClickThree(View view) {
        if (stage != 2) {
            Button buttonThree = findViewById(R.id.buttonThree);
            String btnThreeText = (String) display.getText() + buttonThree.getText();
            display.setText(btnThreeText);
        }
    }

    public void onClickFour(View view) {
        if (stage != 2) {
            Button buttonFour = findViewById(R.id.buttonFour);
            String btnFourText = (String) display.getText() + buttonFour.getText();
            display.setText(btnFourText);
        }
    }

    public void onClickFive(View view) {
        if (stage != 2) {
            Button buttonFive = findViewById(R.id.buttonFive);
            String btnFiveText = (String) display.getText() + buttonFive.getText();
            display.setText(btnFiveText);
        }
    }

    public void onClickSix(View view) {
        if (stage != 2) {
            Button buttonSix = findViewById(R.id.buttonSix);
            String btnSixText = (String) display.getText() + buttonSix.getText();
            display.setText(btnSixText);
        }
    }

    public void onClickSeven(View view) {
        if (stage != 2) {
            Button buttonSeven = findViewById(R.id.buttonSeven);
            String btnSevenText = (String) display.getText() + buttonSeven.getText();
            display.setText(btnSevenText);
        }
    }

    public void onClickEight(View view) {
        if (stage != 2) {
            Button buttonEight = findViewById(R.id.buttonEight);
            String btnEightText = (String) display.getText() + buttonEight.getText();
            display.setText(btnEightText);
        }
    }

    public void onClickNine(View view) {
        if (stage != 2) {
            Button buttonNine = findViewById(R.id.buttonNine);
            String btnNineText = (String) display.getText() + buttonNine.getText();
            display.setText(btnNineText);
        }
    }

    public void onClickClear(View view) {
        total2 = 0;
        display.setText("");
        stage = 0;
    }

    public void onClickPlus(View view) {
        if (stage == 0) {
            Button buttonPlus = findViewById(R.id.buttonPlus);
            String button_text = (String) buttonPlus.getText();
            getOperator(button_text);
            stage = 1;
        }

    }

    public void onClickMinus(View view) {
        if (stage == 0) {
            Button buttonMinus = findViewById(R.id.buttonMinus);
            String button_text = (String) buttonMinus.getText();
            getOperator(button_text);
            stage = 1;
        }

    }

    public void onClickMultiply(View view) {
        if (stage == 0) {
            Button buttonMultiply = findViewById(R.id.buttonMultiply);
            String button_text = (String) buttonMultiply.getText();
            getOperator(button_text);
            stage = 1;
        }

    }

    public void onClickDivide(View view) {
        if (stage == 0) {
            Button buttonDivide = findViewById(R.id.buttonDivide);
            String button_text = (String) buttonDivide.getText();
            getOperator(button_text);
            stage = 1;
        }

    }

    public void onClickPower(View view) {
        if (stage == 0) {
            Button buttonPower = findViewById(R.id.buttonPower);
            String button_text = (String) buttonPower.getText();
            getOperator(button_text);
            stage = 1;
        }

    }

    public void onClickSine(View view) {
        if (!Objects.equals((String) display.getText(), "")) {
            Double total = Double.parseDouble((String) display.getText());
            Double radians = Math.toRadians(total);
            radians = Math.sin(radians);
            display.setText(Double.toString(radians));
        }

    }

    public void onClickCosine(View view) {
        if (!Objects.equals((String) display.getText(), "")) {
            Double total = Double.parseDouble((String) display.getText());
            Double radians = Math.toRadians(total);
            radians = Math.cos(radians);
            display.setText(Double.toString(radians));
        }

    }

    public void onClickTangent(View view) {
        if (!Objects.equals((String) display.getText(), "")) {
            Double total = Double.parseDouble((String) display.getText());
            Double radians = Math.toRadians(total);
            radians = Math.tan(radians);
            display.setText(Double.toString(radians));
        }

    }

    public void onClickSquare(View view) {
        if (!Objects.equals((String) display.getText(), "")) {
            Double total = Double.parseDouble((String) display.getText());
            total = Math.sqrt(total);
            display.setText(Double.toString(total));
        }
    }

    public void onClickEquals(View view) {
        if (stage == 1) {
            double displayValue;
            if (Objects.equals((String) display.getText(), "")){
                displayValue = 0;
            }
            else {
                displayValue = Double.parseDouble((String) display.getText());
            }
            switch (math_operator) {
                case '+':
                    total2 = total1 + displayValue;
                    break;
                case '-':
                    total2 = total1 - displayValue;
                    break;
                case '/':
                    total2 = total1 / displayValue;
                    break;
                case '*':
                    total2 = total1 * displayValue;
                    break;
                case '^':
                    total2 = Math.pow(total1, displayValue);
                    break;
            }
            display.setText(Double.toString(total2));
            total1 = 0;
            stage = 2;
        }
    }
}