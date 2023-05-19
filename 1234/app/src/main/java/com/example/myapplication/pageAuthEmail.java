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

        ImageView imageViewback = findViewById(R.id.imageView4);
        imageViewback.setImageResource(R.drawable.back);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pageAuthEmail.this, pagereg.class);
                startActivity(intent);
            }
        });
    }
}