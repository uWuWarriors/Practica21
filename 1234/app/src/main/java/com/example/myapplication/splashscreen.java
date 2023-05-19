package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class splashscreen extends Activity {
Timer timer;
TimerTask timerTask;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.pas);
        timer = new Timer();
        timerTask = new MyTimerTask();
        timer.schedule(timerTask, 5000);
    }
    class MyTimerTask extends TimerTask{

        @Override
        public void run() {
            Intent intent = new Intent(splashscreen.this, MainActivity.class);
            startActivity(intent);
        }
    };
}

