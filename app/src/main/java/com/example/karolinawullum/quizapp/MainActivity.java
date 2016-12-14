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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Called when the user clicks the PLAY button.
    public void onClickPlay(View view){
        //Intent intent = new Intent(PlayQuiz.class, MultiplayerQuiz.class);
        //startActivity(intent);
        //do something in response to PLAY button
    }

    //Called when the user clicks the MULTIPLAYER button.
    public void onClickMultiplayer(View view){
        //do something in response to MULTIPLAYER button
    }

}
