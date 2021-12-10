package com.example.navdrawerversion.ui.burger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

import com.example.navdrawerversion.CheckOutFragment;
import com.example.navdrawerversion.MainActivity;
import com.example.navdrawerversion.R;

public class BurgerFragment  extends Fragment {

    private CheckBox noMayo;
    private CheckBox noktchp;
    private CheckBox noPkl;
    private CheckBox noOnion;
    private CheckBox noLetuce;
    private CheckBox noMstrd;
    private CheckBox addChs;
    private CheckBox addTmato;
    private CheckBox addBcn;

    public void itemClicked(View v) {

        if(noMayo.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Mayonaise, ");
        }
        if(noktchp.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Ketchup, ");
        }
        if (noPkl.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Pickles, ");
        }
        if (noOnion.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Onions, ");
        }
        if (noLetuce.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Lettuce, ");
        }
        if (noMstrd.isChecked()) {
            CheckOutFragment.mainOrder.add("Burger: no Mustard, ");
        }
        if (addChs.isChecked()) {
            CheckOutFragment.total = +1.00;
            CheckOutFragment.mainOrder.add("Burger: added Cheese, ");
        }
        if (addTmato.isChecked()) {
            CheckOutFragment.total = +1.00;
            CheckOutFragment.mainOrder.add("Burger: added Tomatoes, ");
        }
        if (addBcn.isChecked()) {
            CheckOutFragment.total = +1.00;
            CheckOutFragment.mainOrder.add("Burger: added Bacon, ");
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_combos, container, false);
        noMayo = root.findViewById(R.id.noMayoCB);
        noktchp = root.findViewById(R.id.noKtchpCB);
        noPkl = root.findViewById(R.id.noPklCB);
        noOnion = root.findViewById(R.id.noOnionCB);
        noLetuce = root.findViewById(R.id.noLetucCB);
        noMstrd = root.findViewById(R.id.noMstrdCB);
        addChs = root.findViewById(R.id.addChsCB);
        addTmato = root.findViewById(R.id.addBcnCB);
        addBcn = root.findViewById(R.id.addTmatoCB);

        return root;
    }

}
