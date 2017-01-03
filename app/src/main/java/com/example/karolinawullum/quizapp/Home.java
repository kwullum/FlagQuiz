package com.example.karolinawullum.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Home extends AppCompatActivity {

    Button btnSignIn,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get The Reference Of Buttons
        btnSignIn = (Button)findViewById(R.id.buttonSignIN);
        btnSignUp = (Button)findViewById(R.id.buttonSignUP);

    }

            public void onClick(View view) {

                if(view.getId() == R.id.buttonSignIN) {
                    Intent intentSignIN = new Intent(this, LoginActivity.class);
                        startActivity(intentSignIN);
                }
                else if(view.getId() == R.id.buttonSignUP) {
                    Intent intentSignUP = new Intent(this, Register.class);
                        startActivity(intentSignUP);
                }

            }

    }






}
