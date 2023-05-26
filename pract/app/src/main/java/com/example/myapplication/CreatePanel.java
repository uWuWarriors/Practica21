package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CreatePanel extends Activity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createpanel);
        EditText editTextN = findViewById(R.id.editTextN);
        EditText editTextB = findViewById(R.id.editTextTextB);
        EditText editTextFA = findViewById(R.id.editTextTextFA);
        EditText editTextF = findViewById(R.id.editTextTextF);
        Button button = findViewById(R.id.buttonY);
        button.setEnabled(false);
       editTextF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.button_main);
            }
        });
        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.button_main);
            }
        });
        editTextFA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }
        });
        editTextN.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.button_main);
            }
        });

        TextView TextViewback = findViewById(R.id.some_id3);
        TextViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreatePanel.this, pagereg.class);
                startActivity(intent);
            }
        });
    }
}