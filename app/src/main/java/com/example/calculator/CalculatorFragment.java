package com.example.calculator;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class CalculatorFragment extends Fragment {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    TextView display;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        final View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        display = view.findViewById(R.id.display);

        return view;

    }


    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble((String) display.getText());
        display.setText("");
    }

    public void onClickZero(View view) {
        display.setText("0");
    }
}