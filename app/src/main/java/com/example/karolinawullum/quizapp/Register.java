package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    private  Button register_button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        OnClickButtonListener();
    }

    public void OnClickButtonListener() {
        register_button_sbm = (Button)findViewById(R.id.register_button);
        register_button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.karolinawullum.quizapp");
                        startActivity(intent);
                    }
                }
        );


}


