package com.example.ambulanceservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Driverlogin extends AppCompatActivity {
    Button log_in,forgot,sign;
    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverlogin);
        log_in = findViewById(R.id.login);
        forgot = findViewById(R.id.forgotpassword);
        sign = findViewById(R.id.signup);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}