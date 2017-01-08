
package layout;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
//import android.widget.TextView;

import com.example.karolinawullum.quizapp.Play;
import com.example.karolinawullum.quizapp.R;

public class FragmentOne extends Fragment {

    private EditText userAnswer;
    //public static int a = 0;

    //private boolean wellAnswered;
    //private Button ScoreButton;

    //private SharedPreferences sharedpreferences;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_one, null);
        userAnswer = (EditText)v.findViewById(R.id.editText);
        final TextView tv = (TextView)v.findViewById(R.id.showCorrect);
        final TextView hintv = (TextView)v.findViewById(R.id.textHint);
        //final int a;

        final Button submit = (Button)v.findViewById(R.id.submitBtn1);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //SharedPreferences.Editor editor = sharedpreferences.edit();
                String theAnswer = (userAnswer.getText().toString());
                if (theAnswer.equalsIgnoreCase("Germany")) {
                    //TextView tv = (TextView)v.findViewById(R.id.showCorrect);
                    ((Play) getActivity()).updateScore(1);
                    tv.setText("Correct!");
                    //wellAnswered = true;

                }
                else {
                    tv.setText("Wrong");
                }
                submit.setEnabled(false);

                // updateScore();
            }
        });

        final Button skip = (Button)v.findViewById(R.id.skipBtn);
        skip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                submit.setEnabled(false);
            }
        });

        final Button hint = (Button)v.findViewById(R.id.hintBtn);
        hint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hintv.setText("The capital is Berlin \n The country is in Europe \n It starts with G... ");
                //submit.setEnabled(false);
            }
        });


        return v;}



        /* public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            ScoreButton = (Button)getView().findViewById(R.id.scoreButton);


            final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
            ScoreButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences.Editor editor = app_preferences.edit();

                    if (wellAnswered){
                        editor.putInt("answer_value", 1);

                        // remember to reset your variable for next question
                        wellAnswered = false;
                    }
                    else {
                        editor.putInt("answer_value", 0);
                    }
                    editor.commit();
                }
            });
        } */



    }




