//GREECE FRAGMENT

package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.karolinawullum.quizapp.R;

public class FragmentTwo extends Fragment {

    private EditText userAnswer;
    public static int b = 0;
    //private boolean wellAnswered;
    //private Button ScoreButton;

    //private SharedPreferences sharedpreferences;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_two, null);
        userAnswer = (EditText)v.findViewById(R.id.editText);
        final TextView tv = (TextView)v.findViewById(R.id.showCorrect);
        final TextView hintv = (TextView)v.findViewById(R.id.textHint);


        final Button submit = (Button)v.findViewById(R.id.submitBtn1);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //SharedPreferences.Editor editor = sharedpreferences.edit();
                String theAnswer = (userAnswer.getText().toString());
                if (theAnswer.equalsIgnoreCase("Greece")) {
                    //TextView tv = (TextView)v.findViewById(R.id.showCorrect);
                    b++;
                    tv.setText("Correct!");
                    //wellAnswered = true;

                } else {
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
                hintv.setText("The capital is Athens \n The country is in Europe \n It starts with G... ");
                //submit.setEnabled(false);
            }
        });


        return v;}
}
