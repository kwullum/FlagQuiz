package com.example.karolinawullum.quizapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.provider.ContactsContract;


/**
 * Created by karolinawullum on 03.01.2017.
 */
/*
public class LoginDataBaseAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userinfo.db";
    private static final String TABLE_NAME = "userinfo";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASS = "pass";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table userinfo (email text not null, pass text not null);";


    public LoginDataBaseAdapter(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;


    }

    public void insertUserInfo(UserInfo u);
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, u.getEmail);
        values.put(COLUMN_PASS, u.getPass);

        db.insert(TABLE_NAME, null, values);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }




}
*/