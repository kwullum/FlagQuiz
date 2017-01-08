//THIS IS THE MAIN PAGE YOU COME TO AFTER THE LOGIN, WHERE YOU CAN CHOOSE TO PLAY OR MULTIPLAYER

//I'm having problems making it so that if you press Play, you are taken to the PlayQuiz.java file, aka moving on.

package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_play = (Button)findViewById(R.id.button1);

        /*
        When pressing "Play" you are taken to the next activity,
        and the quiz starts.
         */
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlay = new Intent(MainActivity.this, Play.class);
                startActivity(intentPlay);
            }
        });
    }

}





