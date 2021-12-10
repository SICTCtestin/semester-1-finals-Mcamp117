package com.example.navdrawerversion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



public class CheckOutFragment extends Fragment {
    public static ArrayList<String> mainOrder = new ArrayList<String>();
//    public static ArrayList<Double> total = new ArrayList<Double>();
    public static double total = 0.0;
    private TextView order;
    private TextView price;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_check_out,container,false);
        order=rootView.findViewById(R.id.checkoutOrder);
        price=rootView.findViewById(R.id.checkoutPrice);
        Log.d("Main order issue", String.valueOf(mainOrder));
        String out = "";
        for (int i = 0; i < mainOrder.size(); i++) {
            out+=(mainOrder.get(i)+"\n");
        }
        price.setText(String.valueOf(total));
        order.setText(out);

        return rootView;
    }
}