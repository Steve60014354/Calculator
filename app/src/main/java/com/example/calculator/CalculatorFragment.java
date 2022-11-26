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


public class CalculatorFragment extends Fragment {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return super.onCreateView(inflater, container, savedInstanceState);

    }

    private TextView getDisplay() {
        TextView display = (TextView) getView().findViewById(R.id.display);
        return display;
    }

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble((String) getDisplay().getText());
        getDisplay().setText("");
    }
}