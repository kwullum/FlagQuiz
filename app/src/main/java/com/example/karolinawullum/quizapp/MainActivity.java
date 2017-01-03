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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_play = (Button)findViewById(R.id.button1);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlay = new Intent(MainActivity.this, PlayQuiz.class);
                startActivity(intentPlay);
            }
        });
    }

}





