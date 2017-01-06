package com.example.karolinawullum.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.view.ViewGroup;


import layout.FragmentOne;
import layout.FragmentTwo;
import layout.FragmentThree;


public class Play extends MainActivity {

    /* private Context context;
    private boolean status = false;
    FragmentTransaction fT;
    FragmentManager fM;     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        final ImageButton imageBtn10 = (ImageButton) findViewById(R.id.imageButton10);
        final ImageButton imageBtn9 = (ImageButton) findViewById(R.id.imageButton9);
        final ImageButton imageBtn8 = (ImageButton) findViewById(R.id.imageButton8);

        imageBtn10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                FragmentManager fragMan = getFragmentManager();
                FragmentTransaction fragTrans = fragMan.beginTransaction();
                FragmentOne f1 = new FragmentOne();

                if (f1.isHidden()) {
                    fragTrans.show(f1);

                } else {
                    fragTrans.hide(f1);
                }
                fragTrans.replace(R.id.fragment_place, new FragmentOne());
                fragTrans.commit();
              }


            });


        imageBtn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v.equals(imageBtn9)) {

                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();

                    FragmentTwo f2 = new FragmentTwo();
                    FragmentOne f1 = new FragmentOne();
                    if (f2.isHidden()) {
                        fragTrans.show(f2);
                        fragTrans.hide(f1);
                    } else {
                        fragTrans.hide(f2);
                    }

                    fragTrans.replace(R.id.fragment_place, new FragmentTwo());
                    fragTrans.commit();

                } else {
                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();

                    FragmentTwo f2 = new FragmentTwo();
                    fragTrans.hide(f2);

                }

            }
        });

        imageBtn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    FragmentManager fragMan = getFragmentManager();
                    FragmentTransaction fragTrans = fragMan.beginTransaction();

                    FragmentThree f3 = new FragmentThree();
                    FragmentTwo f2 = new FragmentTwo();
                    FragmentOne f1 = new FragmentOne();
                    /* if (f3.isHidden()) {
                        fragTrans.show(f3);
                        fragTrans.hide(f1);
                        fragTrans.hide(f2);
                    } else {
                        fragTrans.hide(f3);
                    }     */

                    fragTrans.replace(R.id.fragment_place, new FragmentThree());
                    fragTrans.hide(f1);
                    fragTrans.hide(f2);
                    fragTrans.commit();




            }
        });


    }

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


