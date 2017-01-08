package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.provider.ContactsContract;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Register extends Activity {

    LoginDataBaseAdapter helper = new LoginDataBaseAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


    public void onRegisterClick(View v) {
        if (v.getId() == R.id.register_complete)
        {
            EditText email = (EditText) findViewById(R.id.editEmail);
            EditText pass1 = (EditText) findViewById(R.id.editTextPassword);
            EditText pass2 = (EditText) findViewById(R.id.editTextConfirmPassword);

            String emailstr = email.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)) {
                //popup message
                Toast pass = Toast.makeText(Register.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();


            } else {
                //insert input in database
                UserInfo u = new UserInfo();
                u.setEmail(emailstr);
                u.setPass(pass1str);

                helper.insertUserInfo(u);


            }

        }

        Intent registerIntent = new Intent(Register.this, Home.class); //cheeky: changing home to play.
        startActivity(registerIntent);
    }


}









