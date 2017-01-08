package com.example.karolinawullum.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnSignIn = (Button) findViewById(R.id.buttonSignIN);

        /*
        The code below takes you to the next activity (LoginActivity.java)
        when you press the "Sign up or register an account" button.
         */

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignIN = new Intent(Home.this, LoginActivity.class);
                startActivity(intentSignIN);
            }
        });
    }
}
