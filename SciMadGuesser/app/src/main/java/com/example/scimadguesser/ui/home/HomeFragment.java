package com.example.scimadguesser.ui.home;

import android.graphics.Color;
import android.os.Bundle;
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


public class HomeFragment extends Fragment {
    ConstraintLayout screen;
    EditText firstNameTXT;
    EditText lastNameTXT;
    EditText cityTXT;
    EditText schoolTXT;
    EditText broTXT;
    EditText sisTXT;
    Button generatorBTN;
    TextView output;

    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable
            ViewGroup container,@Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_home,container,false);

        screen = rootView.findViewById(R.id.constraintLayout);
        firstNameTXT=rootView.findViewById(R.id.firstTXT);
        lastNameTXT=rootView.findViewById(R.id.lastTXT);
        cityTXT=rootView.findViewById(R.id.cityTXT);
        schoolTXT=rootView.findViewById(R.id.schoolTXT);
        broTXT=rootView.findViewById(R.id.broTXT);
        sisTXT=rootView.findViewById(R.id.sisTXT);
        output=rootView.findViewById(R.id.output);
        generatorBTN=rootView.findViewById(R.id.generator);
        screen.setBackgroundColor(Color.rgb(108, 150, 141));
        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });

        return rootView;
    }


    private void generate(){
        String first=String.valueOf(firstNameTXT.getText());
        String last=String.valueOf(lastNameTXT.getText());
        String city=String.valueOf(cityTXT.getText());
        String school=String.valueOf(schoolTXT.getText());
        String bro=String.valueOf(broTXT.getText());
        String sis=String.valueOf(sisTXT.getText());

        int rF = (int) (Math.random()*first.length());
        int rL = (int) (Math.random()*last.length());
        int rC = (int) (Math.random()*city.length());
        int rS = (int) (Math.random()*school.length());
        int rB = (int) (Math.random()*bro.length());
        int rSi = (int) (Math.random()*sis.length());

        String sciFiFirst = first.substring(0,rF)+last.substring(rL);
        String sciFiLast = city.substring(0,rC)+school.substring(rS);
        String sciFiHome = bro.substring(rB)+sis.substring(0,rSi);
        output.setText(String.format("Welcome! "+sciFiFirst+" "+sciFiLast+" from "+sciFiHome));
    }

}