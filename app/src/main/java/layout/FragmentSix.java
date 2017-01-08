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

import com.example.karolinawullum.quizapp.Play;
import com.example.karolinawullum.quizapp.R;

public class FragmentSix extends Fragment {
    private EditText userAnswer;
    private boolean hintUsed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_six, null);
        userAnswer = (EditText)v.findViewById(R.id.editText);
        final TextView tv = (TextView)v.findViewById(R.id.showCorrect);
        final TextView hintv = (TextView)v.findViewById(R.id.textHint);

        final Button submit = (Button)v.findViewById(R.id.submitBtn1);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String theAnswer = (userAnswer.getText().toString());
                if (theAnswer.equalsIgnoreCase("Cyprus")) {
                    if (!hintUsed) {
                        ((Play) getActivity()).updateScore(1);
                        tv.setText("Correct, +1");
                    } else {
                        tv.setText("Correct, +0");
                    }
                } else {
                    tv.setText("Wrong");
                }
                submit.setEnabled(false);

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
                hintv.setText("The flag belongs to Cyprus");
                hint.setEnabled(false);
                hintUsed = true;
            }
        });


        return v;}
}
