//THIS IS THE MAIN PAGE YOU COME TO AFTER THE LOGIN, WHERE YOU CAN CHOOSE TO PLAY OR MULTIPLAYER

//I'm having problems making it so that if you press Play, you are taken to the PlayQuiz.java file, aka moving on.

package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button; //button imported

public class MainActivity extends AppCompatActivity {

    private static Button button1_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();

    }

    public void OnClickButtonListener() {
        button1_sbm = (Button)findViewById(R.id.button1);
        button1_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.karolinawullum.quizapp.PlayQuiz");
                        startActivity(intent);
                    }
                }
        );
    }


    }





