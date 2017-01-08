package com.example.karolinawullum.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.ViewGroup;


import layout.FragmentOne;
import layout.FragmentTwo;
import layout.FragmentThree;
import layout.FragmentDefault;


public class Play extends MainActivity {

    private int total = 0;

    public void updateScore(int add){
        total += add;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //final int total = (FragmentOne.a + FragmentTwo.b);
        final String myScore = String.valueOf(total);

        final ImageButton imageBtn10 = (ImageButton) findViewById(R.id.imageButton10);
        final ImageButton imageBtn9 = (ImageButton) findViewById(R.id.imageButton9);
        final ImageButton imageBtn8 = (ImageButton) findViewById(R.id.imageButton8);
        final ImageButton imageBtn7 = (ImageButton) findViewById(R.id.imageButton7);
        final ImageButton imageBtn6 = (ImageButton) findViewById(R.id.imageButton6);
        final ImageButton imageBtn5 = (ImageButton) findViewById(R.id.imageButton5);
        final ImageButton imageBtn4 = (ImageButton) findViewById(R.id.imageButton4);
        final ImageButton imageBtn3 = (ImageButton) findViewById(R.id.imageButton3);

        final Button button_score = (Button)findViewById(R.id.scoreButton);


        FragmentManager fragMan = getFragmentManager();
        FragmentTransaction fragTrans = fragMan.beginTransaction();
        FragmentDefault fd = new FragmentDefault();
        fragTrans.replace(R.id.fragment_place, fd);
        fragTrans.commit();

        fragTrans.hide(new FragmentOne());
        fragTrans.hide(new FragmentTwo());
        fragTrans.hide(new FragmentThree());

        button_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                //bundle.putString("yes", myScore);
                bundle.putString("yes", String.valueOf(total));

                Intent intent= new Intent(Play.this, FinalActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

                /*
                Intent intentPlay = new Intent(Play.this, FinalActivity.class);
                intentPlay.putExtras(bundle);
                startActivity(intentPlay);
                */
            }
        });

        imageBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();
                    fragTrans.replace(R.id.fragment_place, new FragmentOne());
                    fragTrans.commit();
                    //imageBtn10.setEnabled(false);
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
                fragTrans.replace(R.id.fragment_place, new FragmentThree());
                fragTrans.commit();
            }
        });

        imageBtn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentThree());
                fragTrans.commit();
            }
        });

        imageBtn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentThree());
                fragTrans.commit();
            }
        });

        imageBtn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentThree());
                fragTrans.commit();
                //imageBtn4.setEnabled(false);
            }
        });

        imageBtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                fragTrans.replace(R.id.fragment_place, new FragmentThree());
                fragTrans.commit();
            }
        });


        //sharedpreferences = getSharedpreferences("mypref", Context.MODE_PRIVATE);



    }




}





