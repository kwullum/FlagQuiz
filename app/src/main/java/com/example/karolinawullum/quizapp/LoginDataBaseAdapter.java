package com.example.karolinawullum.quizapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.provider.ContactsContract;
import android.database.Cursor;


public class LoginDataBaseAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "userinfo.db";
    private static final String TABLE_NAME = "userinfo";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASS = "pass";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table userinfo (id integer primary key not null , " + "email text not null, pass text not null);";


    public LoginDataBaseAdapter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertUserInfo(UserInfo u) {
        SQLiteDatabase db = this.getWritableDatabase(); //SQLiteDatabase added
        ContentValues values = new ContentValues();

        String query = "select * from userinfo";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_EMAIL, u.getEmail());
        values.put(COLUMN_PASS, u.getPass());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    /*
    Below, (inside public String searchPass), I changed somethings from Pryia's videos.
    mEmailView should be a, and mPasswordView should be b.
     */

    public String searchPass(String email) {
        db = this.getReadableDatabase();
        String query = "select email, pass from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String mEmailView, mPasswordView;
        mPasswordView = "not found";
        if(cursor.moveToFirst()) {
            do{
                mEmailView = cursor.getString(0);
                mPasswordView = cursor.getString(1);

                if(mEmailView.equals(email)) {
                    mPasswordView = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
            cursor.close();                         //added due to yellowing of rawQuery in Cursor cursor = db.rawQuery(query, null);
        }
        return mPasswordView;
    }


    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }

}
