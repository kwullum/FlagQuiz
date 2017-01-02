package com.example.karolinawullum.quizapp;

/**
 * Created by karolinawullum on 18.12.2016.
 */

public class User {
    public long userId;
    public String username;
    public String password;

    public User(long userId, String username, String password){
        this.userId=userId;
        this.username=username;
        this.password=password;
    }
}
