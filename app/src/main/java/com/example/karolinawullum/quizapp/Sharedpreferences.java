package com.example.karolinawullum.quizapp;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class SharedPreferences extends Play {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        /*Bundle bundle = getIntent().getExtras();
        final String yes_sir = bundle.getString("yes");

        final TextView tv2 = (TextView)findViewById(R.id.textView5);
        final Button submit = (Button)findViewById(R.id.button4);


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(yes_sir);
            }
        });*/

    }
}
