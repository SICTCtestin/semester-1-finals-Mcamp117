package com.example.navdrawerversion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import androidx.fragment.app.Fragment;

public class condimentsFragment extends Fragment {

    private RadioButton k;
    private RadioButton mu;
    private RadioButton r;
    private RadioButton b;
    private RadioButton bu;
    private RadioButton h;
    private RadioButton f;
    private RadioButton sp;
    private RadioButton kn;
    private RadioButton s;
    private RadioButton p;

    public condimentsFragment() {
        // Required empty public constructor
    }

    public static condimentsFragment newInstance(String param1, String param2) {
        condimentsFragment fragment = new condimentsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

        public void onRadioButtonClicked(View v) {
        k = (RadioButton) getView().findViewById(R.id.Ketchup);
        mu = (RadioButton) getView().findViewById(R.id.Mustard);
        b = (RadioButton) getView().findViewById(R.id.BBQ);
        bu = (RadioButton) getView().findViewById(R.id.Buffalo);
        r = (RadioButton) getView().findViewById(R.id.Ranch);
        h = (RadioButton) getView().findViewById(R.id.Hot_Sauce);
        f = (RadioButton) getView().findViewById(R.id.Fork);
        kn = (RadioButton) getView().findViewById(R.id.Knife);
        sp = (RadioButton) getView().findViewById(R.id.Spoon);
        s = (RadioButton) getView().findViewById(R.id.Salt);
        p = (RadioButton) getView().findViewById(R.id.Pepper);

        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.Ketchup:
                if(checked)
                    CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("Ketchup, ");
                    break;
                case R.id.Mustard:
                    if(checked)
                        CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("Mustard, ");
                    break;
                case R.id.BBQ:
                    if(checked)
                        CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("BBQ, ");
                    break;
                case R.id.Buffalo:
                    if(checked)
                        CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("Buffalo, ");
                    break;
                case R.id.Ranch:
                    if(checked)
                        CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("Ranch, ");
                    break;
                case R.id.Hot_Sauce:
                    if(checked)
                        CheckOutFragment.total += .25;
                    CheckOutFragment.mainOrder.add("Hot-Sauce, ");
                    break;
                case R.id.Fork:
                    if(checked)
                        CheckOutFragment.mainOrder.add("Fork, ");
                    break;
                case R.id.Knife:
                    if(checked)
                        CheckOutFragment.mainOrder.add("Knife, ");
                    break;
                case R.id.Spoon:
                    if(checked)
                        CheckOutFragment.mainOrder.add("Spoon, ");
                    break;
                case R.id.Salt:
                    if(checked)
                        CheckOutFragment.mainOrder.add("Salt, ");
                    break;
                case R.id.Pepper:
                    if(checked)
                        CheckOutFragment.mainOrder.add("Pepper, ");
                    break;
            }
    }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_condiments, container, false);
        }

}



