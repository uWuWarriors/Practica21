package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class pageAuthEmail extends Activity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageauthemail);
        EditText editText1 = findViewById(R.id.editTextcode1);
        EditText editText2 = findViewById(R.id.editTextcode2);
        EditText editText3 = findViewById(R.id.editTextcode3);
        EditText editText4 = findViewById(R.id.editTextcode4);
        TextView textView = findViewById(R.id.hint);
        ImageView imageViewback = findViewById(R.id.imageView4);
        imageViewback.setImageResource(R.drawable.back);
        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = "" + editText1.getText() + editText2.getText() + editText3.getText() + editText4.getText();
                Intent intent = new Intent(pageAuthEmail.this, pagepass.class);
                startActivity(intent);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pageAuthEmail.this, pagereg.class);
                startActivity(intent);
            }
        });
       new CountDownTimer(60000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                NumberFormat f = new DecimalFormat("00");
                long sec = (millisUntilFinished/1000)%60;
                textView.setText("Отправить код повторно можно\nбудет через " + f.format(sec) + " секунд");
            }

            @Override
            public void onFinish() {
                textView.setText("Отправить код повторно можно\nбудет через 00");
            }
        }.start();
    }
}
