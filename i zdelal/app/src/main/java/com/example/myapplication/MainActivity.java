package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
   String Sdown, SMove, SUp;
   int[] title = new int[3];
   ImageView imageView3, imageView2;
   TextView textView, textView1, textView2;
   float x1 = 0;
   int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView3);
        textView2 = findViewById(R.id.some_id3);
        textView = findViewById(R.id.some_id);
        textView1 = findViewById(R.id.some_id2);
        imageView.setImageResource(R.drawable.shape);
        imageView2 = findViewById(R.id.imageView5);
        imageView3 = findViewById(R.id.imageView6);
        imageView2.setImageResource(R.drawable.navigation);
        imageView3.setImageResource(R.drawable.page12);
        LinearLayout linearLayout = findViewById(R.id.canvas);
        linearLayout.setOnTouchListener(this::onTouch);
        title[0] = 1;
        title[1] = 2;
        title[2] = 3;
        Check(i);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pagereg.class);
                startActivity(intent);
            }
        });
    }
    private boolean onTouch(View view, MotionEvent motionEvent) {
     float x = motionEvent.getX();
     float y = motionEvent.getY();
     switch (motionEvent.getAction()){
         case MotionEvent.ACTION_DOWN:
             x1 = x;
             break;
         case MotionEvent.ACTION_UP:
         case MotionEvent.ACTION_CANCEL:
             if(x > x1){
                 if (i !=0){
                     i--;
                 }
             }else if (x < x1){
                 if (i < 2){
                     i++;
                 }
                 if (i == 2){
                     textView.setText("Завершить");
                 }
             }
             Check(i);
             break;
     }
     return true;
    }
    private void Check(int i) {
        if(title[i] == 1) {
            textView.setText("Анализы");
            textView1.setText("Экспресс сбор и получение проб");
            imageView3.setImageResource(R.drawable.page12);
            imageView2.setImageResource(R.drawable.navigation);
        }
        if(title[i] == 2) {
            textView.setText("Уведомления");
            textView1.setText("Экспресс сбор и получение проб");
            imageView3.setImageResource(R.drawable.page13);
            imageView2.setImageResource(R.drawable.navigation2);
        }
        if(title[i] == 3) {
            textView.setText("Мониторинг");
            textView1.setText("Наши врачи всегда наблюдают \n" +
                    "за вашими показателями здоровья");
            imageView3.setImageResource(R.drawable.page14);
            imageView2.setImageResource(R.drawable.navigation3);
        }
    }
}