package com.example.navdrawerversion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.BitSet;

public class sandwhichesFragment extends Fragment {

    private CheckBox ritz2;
    private CheckBox chknGrllCB;
    private CheckBox fshSndwchCB;
    private CheckBox pbjCB;

    private Button sndwchBTN;

    public void onCheckBoxChecked(View v) {

            if (ritz2.isChecked()) {
                CheckOutFragment.total += 4.00;
                CheckOutFragment.mainOrder.add("Choice Double Ritz, ");
            }
            if (chknGrllCB.isChecked()) {
                CheckOutFragment.total += 5.00;
                CheckOutFragment.mainOrder.add("Choice Chicken Grill, ");
            }
            if (fshSndwchCB.isChecked()) {
                CheckOutFragment.total += 4.50;
                CheckOutFragment.mainOrder.add("Choice Fish Sandwich, ");
            }
            if (pbjCB.isChecked()) {
                CheckOutFragment.total += 3.50;
                CheckOutFragment.mainOrder.add("Choice World's Best PB&J, ");
            }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_combos, container, false);
        ritz2 = root.findViewById(R.id.ritz2CB);
        chknGrllCB = root.findViewById(R.id.chknGrllCB);
        fshSndwchCB = root.findViewById(R.id.fshSndwchCB);
        pbjCB = root.findViewById(R.id.pbjCB);
        sndwchBTN = root.findViewById(R.id.sndwchBTN);
        sndwchBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onCheckBoxChecked(root); }
        });
        return root;
    }
}