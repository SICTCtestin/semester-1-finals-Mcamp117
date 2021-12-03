package com.example.scimadguesser.ui.slideshow;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.scimadguesser.R;
import com.example.scimadguesser.databinding.FragmentSlideshowBinding;

import java.util.Random;

public class SlideshowFragment extends Fragment {
     ConstraintLayout screen;
     TextView tries;
     TextView score;
     TextView correct;
     Button guessBTN;
     EditText userGuess;
    int userTries=5;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_slideshow, container, false);
        screen = rootView.findViewById(R.id.constraintLayout);
        tries = rootView.findViewById(R.id.guesses);
        score = rootView.findViewById(R.id.score);
        correct = rootView.findViewById(R.id.guessCorrectness);
        guessBTN = rootView.findViewById(R.id.guessBTN);
        userGuess = rootView.findViewById(R.id.userGuess);
        screen.setBackgroundColor(Color.rgb(66,135,245));
        int number = new Random().nextInt(101);

        guessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                guess(number,userTries);
            }
        });
        return rootView;
    }

    private void guess(int num, int guessesRemaining){
        int userInput=Integer.valueOf(String.valueOf(userGuess.getText()));
            if (userInput == num) {
                correct.setText("You got the number right");
                score.setText(String.valueOf(50 + guessesRemaining * 5));
                guessBTN.setVisibility(View.INVISIBLE);

            }
            else if (userInput < num) {
                correct.setText("The number is greater than " + userInput);
                userTries=guessesRemaining-1;
                tries.setText(String.valueOf(guessesRemaining));

            }
            else if (userInput > num) {
                correct.setText("The number is less than " + userInput);
                userTries=guessesRemaining-1;
                tries.setText(String.valueOf(guessesRemaining));

            }

        if (guessesRemaining==0){
            correct.setText("You have ran out of triers the correct number was "+num);
            guessBTN.setVisibility(View.INVISIBLE);
        }
    }
}



