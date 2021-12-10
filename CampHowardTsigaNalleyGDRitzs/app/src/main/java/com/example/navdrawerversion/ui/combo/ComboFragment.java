package com.example.navdrawerversion.ui.combo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navdrawerversion.CheckOutFragment;
import com.example.navdrawerversion.MainActivity;
import com.example.navdrawerversion.R;

public class ComboFragment extends Fragment {

    private CheckBox combo1;
    private CheckBox combo2;
    private CheckBox combo3;
    private CheckBox combo4;
    private CheckBox comboBskt;
    private CheckBox comboDeal;
    private CheckBox comboKids;

    private Button comboBTN;

    //https://stackoverflow.com/questions/18336151/how-to-check-if-android-checkbox-is-checked-within-its-onclick-method-declared & Scooter
    public void onCheckBoxChecked(View v) {
        if(combo1.isChecked()) {
            CheckOutFragment.total = +5.00;
            CheckOutFragment.mainOrder.add("Choice COMBO #1, ");
        }
        if(combo2.isChecked()) {
            CheckOutFragment.total = +5.50;
            CheckOutFragment.mainOrder.add("Choice COMBO #2, ");
        }
        if (combo3.isChecked()) {
            CheckOutFragment.total = +6.00;
            CheckOutFragment.mainOrder.add("Choice COMBO #3, ");
        }
        if (combo4.isChecked()) {
            CheckOutFragment.total = +5.00;
            CheckOutFragment.mainOrder.add("Choice COMBO #4, ");
        }
        if (comboBskt.isChecked()) {
            CheckOutFragment.total = +7.00;
            CheckOutFragment.mainOrder.add("Choice RITZ COMBO BASKET, ");
        }
        if (comboDeal.isChecked()) {
            CheckOutFragment.total = +6.00;
            CheckOutFragment.mainOrder.add("Choice COOL DEAL, ");
        }
        if (comboKids.isChecked()) {
            CheckOutFragment.total = +4.00;
            CheckOutFragment.mainOrder.add("Choice ITZY RITZY FOR KIDS, ");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_combos, container, false);
        combo1= root.findViewById(R.id.combo1CB);
        combo2= root.findViewById(R.id.combo2CB);
        combo3= root.findViewById(R.id.combo3CB);
        combo4= root.findViewById(R.id.combo4CB);
        comboBskt= root.findViewById(R.id.comboBsktCB);
        comboDeal= root.findViewById(R.id.comboDealCB);
        comboKids= root.findViewById(R.id.comboKidsCB);
        comboBTN= root.findViewById(R.id.comboBTN);
        comboBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onCheckBoxChecked(root); }
        });

        return root;
    }
}
