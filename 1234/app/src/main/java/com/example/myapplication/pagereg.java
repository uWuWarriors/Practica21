package com.example.myapplication;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class pagereg extends Activity {
    String email ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagereg);
        Button button = findViewById(R.id.button);
        EditText emailValidate = findViewById(R.id.editTextTextEmailAddress);
        //String email = emailValidate.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        button.setEnabled(false);
        emailValidate.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
             button.setEnabled(false);
           }
           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
                   button.setEnabled(false);
           }
               @Override
               public void afterTextChanged (Editable s){
                   email = emailValidate.getText().toString().trim();
                   if (email.matches(emailPattern) && s.length() > 0) {
                       button.setEnabled(true);
                       button.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {


                                   Intent intent = new Intent(pagereg.this, pageAuthEmail.class);
                                   startActivity(intent);


                           }
                       });
                   } else {
                       button.setEnabled(false);

                   }
               }
           });
    }
}