package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editEmail = (EditText) findViewById(R.id.editEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        final EditText editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);

        final Button register_complete = (Button) findViewById(R.id.register_complete);
    }


}


