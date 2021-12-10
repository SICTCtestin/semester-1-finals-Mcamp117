package com.example.navdrawerversion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link saladsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class saladsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RadioButton first;
    private RadioButton second;
    private RadioButton third;
    private RadioButton fourth;
    private RadioButton fifth;
    private Button add;

    public saladsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment saladsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static saladsFragment newInstance(String param1, String param2) {
        saladsFragment fragment = new saladsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    View rootView=inflater.inflate(R.layout.fragment_salads,container, false);
    first=rootView.findViewById(R.id.cgs);
    second=rootView.findViewById(R.id.dgs);
    third=rootView.findViewById(R.id.radioButton3);
    fourth=rootView.findViewById(R.id.ts);
    fifth=rootView.findViewById(R.id.cs);
    add=rootView.findViewById(R.id.addBTN);
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onRadioButtonClicked(rootView);
        }
    });

    return rootView;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void onRadioButtonClicked(View v) {
        first= getView().findViewById(R.id.cgs);
        second= getView().findViewById(R.id.dgs);
        third= getView().findViewById(R.id.radioButton3);
        fourth= getView().findViewById(R.id.ts);
        fifth= getView().findViewById(R.id.cs);

                if(first.isChecked()) {
                    CheckOutFragment.total += 2.50;
                    CheckOutFragment.mainOrder.add("Choice Garden Salad, ");
                }
                if(second.isChecked()) {
                    CheckOutFragment.total += 3.00;
                    CheckOutFragment.mainOrder.add("Deluxe Garden Salad   ");
                }
                if (third.isChecked()) {
                    CheckOutFragment.total += 2.00;
                    CheckOutFragment.mainOrder.add("Side Salad   ");
                }
                if (fourth.isChecked()) {
                    CheckOutFragment.total += 2.75;
                    CheckOutFragment.mainOrder.add("Taco Salad   ");
                }
                if (fifth.isChecked()) {
                    CheckOutFragment.total += 3.25;
                    CheckOutFragment.mainOrder.add("Chicken Salad   ");
                }
        }



}