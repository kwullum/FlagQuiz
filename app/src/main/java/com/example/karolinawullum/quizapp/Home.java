package com.example.karolinawullum.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnSignIn = (Button) findViewById(R.id.buttonSignIN);
        Button btnSignUp = (Button) findViewById(R.id.buttonSignUP);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignIN = new Intent(Home.this, LoginActivity.class);
                startActivity(intentSignIN);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUP = new Intent(Home.this, Register.class);
                startActivity(intentSignUP);

            }
        });
    }
}
