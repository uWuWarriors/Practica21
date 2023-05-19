package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView3);
        ImageView imageView2 = findViewById(R.id.imageView5);
        ImageView imageView3 = findViewById(R.id.imageView6);
        TextView textViewpro = findViewById(R.id.some_id3);
        imageView.setImageResource(R.drawable.shape);
        imageView2.setImageResource(R.drawable.navigation);
        imageView3.setImageResource(R.drawable.page12);
        textViewpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pagereg.class);
                startActivity(intent);
            }
        });
    }
}