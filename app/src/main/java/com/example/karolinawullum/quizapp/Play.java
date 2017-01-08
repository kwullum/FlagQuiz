package com.example.karolinawullum.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;
import android.app.FragmentTransaction;
import android.widget.Button;
import android.widget.ImageButton;

import layout.FragmentOne;
import layout.FragmentTwo;
import layout.FragmentThree;
import layout.FragmentFour;
import layout.FragmentFive;
import layout.FragmentSix;
import layout.FragmentSeven;
import layout.FragmentEight;
import layout.FragmentDefault;


public class Play extends MainActivity {

    private int total = 0;
    //Calculates score. Gets updated when user answers correctly in a question (fragment)
    public void updateScore(int add){ //When you answer correctly, you get 1 point.
        total += add;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final String myScore = String.valueOf(total);

        //Below all the flag buttons are declared.

        final ImageButton imageBtn10 = (ImageButton) findViewById(R.id.imageButton10);
        final ImageButton imageBtn9 = (ImageButton) findViewById(R.id.imageButton9);
        final ImageButton imageBtn8 = (ImageButton) findViewById(R.id.imageButton8);
        final ImageButton imageBtn7 = (ImageButton) findViewById(R.id.imageButton7);
        final ImageButton imageBtn6 = (ImageButton) findViewById(R.id.imageButton6);
        final ImageButton imageBtn5 = (ImageButton) findViewById(R.id.imageButton5);
        final ImageButton imageBtn4 = (ImageButton) findViewById(R.id.imageButton4);
        final ImageButton imageBtn3 = (ImageButton) findViewById(R.id.imageButton3);

        final Button button_score = (Button)findViewById(R.id.scoreButton);

        //First fragment shown is the default, which is blank
        FragmentManager fragMan = getFragmentManager();
        FragmentTransaction fragTrans = fragMan.beginTransaction();
        FragmentDefault fd = new FragmentDefault();
        fragTrans.replace(R.id.fragment_place, fd);
        fragTrans.commit();

        //Get Score button takes you to FinalActivity
        button_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("yes", String.valueOf(total));

                Intent intent= new Intent(Play.this, FinalActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        //Each imagebutton loads a new question (fragment)
        imageBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();
                    fragTrans.replace(R.id.fragment_place, new FragmentOne());
                    fragTrans.commit();
            }

        });


        imageBtn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentTwo());
                fragTrans.commit();
            }
        });

        imageBtn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();
                    fragTrans.replace(R.id.fragment_place, new FragmentThree());
                    fragTrans.commit();
            }
        });

        imageBtn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentFour());
                fragTrans.commit();
            }
        });

        imageBtn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentFive());
                fragTrans.commit();
            }
        });

        imageBtn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentSix());
                fragTrans.commit();
            }
        });

        imageBtn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentSeven());
                fragTrans.commit();
                //imageBtn4.setEnabled(false);
            }
        });

        imageBtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentEight());
                fragTrans.commit();
            }
        });


    }


}





