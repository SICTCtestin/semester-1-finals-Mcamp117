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
 * Use the {@link specialtiesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class specialtiesFragment extends Fragment {

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
    private Button add;

    public specialtiesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment specialtiesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static specialtiesFragment newInstance(String param1, String param2) {
        specialtiesFragment fragment = new specialtiesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_specialties,container, false);
        first=rootView.findViewById(R.id.radioButton);
        second=rootView.findViewById(R.id.radioButton2);
        third=rootView.findViewById(R.id.radioButton3);
        add=rootView.findViewById(R.id.addBTN2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(rootView);
            }
        });

        return rootView;
    }
    public void onRadioButtonClicked(View v) {

        if(first.isChecked()) {
            CheckOutFragment.total = +3.50;
            CheckOutFragment.mainOrder.add("World's greatest PBJ s ");
        }
        if(second.isChecked()) {
            CheckOutFragment.total = +1.50;
            CheckOutFragment.mainOrder.add("ShoeString Fries   ");
        }
        if (third.isChecked()) {
            CheckOutFragment.total = +1.50;
            CheckOutFragment.mainOrder.add("Steamed Vegetables   ");
        }
    }

}