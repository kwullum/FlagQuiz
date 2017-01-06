package com.example.karolinawullum.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.widget.ImageButton;


import layout.FragmentOne;
import layout.FragmentTwo;


public class Play extends MainActivity {

    //Fragment fragment2;
    //ImageButton imageBtn10;
    //ImageButton imageBtn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ImageButton imageBtn10 = (ImageButton)findViewById(R.id.imageButton10);
        ImageButton imageBtn9 = (ImageButton)findViewById(R.id.imageButton9);


        imageBtn10 = (ImageButton)findViewById(R.id.imageButton10);
        imageBtn10.setOnClickListener(new View.OnClickListener()      {
               @Override
                public void onClick(View v) {
                   FragmentManager fragMan = getFragmentManager();
                   FragmentTransaction fragTrans = fragMan.beginTransaction();

                   FragmentOne f1 = new FragmentOne();
                   //fragTrans.add(R.id.fragment_place,f1);
                   fragTrans.replace(R.id.fragment_place, new FragmentOne());
                   fragTrans.addToBackStack(null);
                   fragTrans.commit();

               }
        });

        imageBtn9 = (ImageButton)findViewById(R.id.imageButton9);
        imageBtn9.setOnClickListener(new View.OnClickListener()      {

               @Override
                public void onClick(View v) {
                   if(v.equals(imageBtn9)) {

                   FragmentManager fragMan = getFragmentManager();
                   FragmentTransaction fragTrans = fragMan.beginTransaction();

                   FragmentTwo f2 = new FragmentTwo();
                   fragTrans.replace(R.id.fragment_place2, new FragmentTwo());
                   //fragTrans.add(R.id.fragment_place2,f2);
                   fragTrans.addToBackStack(null);
                   //fragTrans.hide(fragment2);
                   fragTrans.commit();
                                          }

               }
        });

    }


    /* public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_fragment_one, container, false);


    }

    public void ChangeFragment(View view) {


        if(view == findViewById(R.id.imageButton10)) {
            fragment = new FragmentOne();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if(view == findViewById(R.id.imageButton9))  {
            fragment = new FragmentTwo();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
    }
    */

}
