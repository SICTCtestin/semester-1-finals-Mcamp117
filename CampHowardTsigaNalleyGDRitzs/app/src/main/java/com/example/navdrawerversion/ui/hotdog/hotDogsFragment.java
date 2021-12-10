package com.example.navdrawerversion.ui.hotdog;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.RadioButton;

import com.example.navdrawerversion.CheckOutFragment;
import com.example.navdrawerversion.MainActivity;
import com.example.navdrawerversion.R;

public class hotDogsFragment extends Fragment {
    private CheckBox first;
    private CheckBox second;
    private CheckBox third;
    private Button add;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_hot_dogs,container,false);
        first=rootView.findViewById(R.id.aahd);
        second=rootView.findViewById(R.id.cd);
        third=rootView.findViewById(R.id.cdc);
        add=rootView.findViewById(R.id.addToOrder);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCheckBoxChecked();
            }
        });

        return rootView;
    }

    public void onCheckBoxChecked(){
        if(first.isChecked()) {
            CheckOutFragment.total = +1.50;
            CheckOutFragment.mainOrder.add("All-American Hot Dog ");
        }
        if(second.isChecked()) {
            CheckOutFragment.total = +2.00;
            CheckOutFragment.mainOrder.add("Coney Dog  ");
        }
        if (third.isChecked()) {
            CheckOutFragment.total = +2.50;
            CheckOutFragment.mainOrder.add("Coney Dog w/ Cheese   ");
        }

    }

}