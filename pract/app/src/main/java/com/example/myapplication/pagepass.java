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

public class pagepass extends Activity {
    int i = 0;
    String value = "";
    ImageView imageView, imageView1,imageView2, imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagepass);
        Button button1 =findViewById(R.id.button1);
        Button button2 =findViewById(R.id.button2);
        Button button3 =findViewById(R.id.button3);
        Button button4 =findViewById(R.id.button4);
        Button button5 =findViewById(R.id.button5);
        Button button6 =findViewById(R.id.button6);
        Button button7 =findViewById(R.id.button7);
        Button button8 =findViewById(R.id.button8);
        Button button9 =findViewById(R.id.button9);
        imageView = findViewById(R.id.imageViewint1);
        imageView1 = findViewById(R.id.imageViewint2);
        imageView2 = findViewById(R.id.imageViewint3);
        imageView3 = findViewById(R.id.imageViewint4);
        imageView.setImageResource(R.drawable.ellipse2);
        imageView1.setImageResource(R.drawable.ellipse2);
        imageView2.setImageResource(R.drawable.ellipse2);
        imageView3.setImageResource(R.drawable.ellipse2);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                value = value + "1";
                break;
            case R.id.button2:
                value = value + "2";
                break;
            case R.id.button3:
                value = value + "3";
                break;
            case R.id.button4:
                value = value + "4";
                break;
            case R.id.button5:
                value = value + "5";
                break;
            case R.id.button6:
                value = value + "6";
                break;
            case R.id.button7:
                value = value + "7";
                break;
            case R.id.button8:
                value = value + "8";
                break;
            case R.id.button9:
                value = value + "9";
                break;
        }
        i++;
        switch(i){
            case 1:
            case 2:
            case 3:
            case 4:

        }
        if(i == 1){
            imageView.setImageResource(R.drawable.ellipse);
        }
        if(i == 2){
            imageView1.setImageResource(R.drawable.ellipse);
        }
        if(i == 3){
            imageView2.setImageResource(R.drawable.ellipse);
        }
        if(i == 4){
            imageView3.setImageResource(R.drawable.ellipse);
            Intent intent = new Intent(pagepass.this, CreatePanel.class);
            startActivity(intent);
        }
    }
}