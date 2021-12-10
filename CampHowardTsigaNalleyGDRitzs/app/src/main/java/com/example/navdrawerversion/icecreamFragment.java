package com.example.navdrawerversion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class icecreamFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    private TextView scoops;
    private Spinner icecream1;
    private TextView malts;
    private Spinner icecream2;
    private TextView shakes;
    private Spinner icecream3;
    private TextView splits;
    private Spinner icecream4;
    private TextView size;
    private Spinner icecream5;
    private TextView flavors;
    private Spinner icecream6;
    private Button back;

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_icecream, container, false);

        scoops = rootView.findViewById(R.id.Scoops);
        icecream1 = rootView.findViewById(R.id.icecream1);
        malts = rootView.findViewById(R.id.malts);
        icecream2 = rootView.findViewById(R.id.icecream2);
        shakes = rootView.findViewById(R.id.Shakes);
        icecream3 = rootView.findViewById(R.id.icecream3);
        splits = rootView.findViewById(R.id.Splits);
        icecream4 = rootView.findViewById(R.id.icecream4);
        splits = rootView.findViewById(R.id.Splits);
        icecream5 = rootView.findViewById(R.id.icecream5);
        splits = rootView.findViewById(R.id.Splits);
        icecream6 = rootView.findViewById(R.id.icecream6);

        //scoops
        ArrayAdapter<CharSequence> scoop = ArrayAdapter.createFromResource(getContext(),R.array.icecream1, android.R.layout.simple_spinner_item);
        scoop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream1.setAdapter(scoop);

        icecream1.setOnItemSelectedListener(this);

        //malts
        ArrayAdapter<CharSequence> scoop2 = ArrayAdapter.createFromResource(getContext(),R.array.icecream2, android.R.layout.simple_spinner_item);
        scoop2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream2.setAdapter(scoop2);

        icecream2.setOnItemSelectedListener(this);

        //shakes
        ArrayAdapter<CharSequence> scoop3 = ArrayAdapter.createFromResource(getContext(),R.array.icecream3, android.R.layout.simple_spinner_item);
        scoop3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream3.setAdapter(scoop3);

        icecream3.setOnItemSelectedListener(this);

        //splits
        ArrayAdapter<CharSequence> scoop4 = ArrayAdapter.createFromResource(getContext(),R.array.icecream4, android.R.layout.simple_spinner_item);
        scoop4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream4.setAdapter(scoop4);

        icecream4.setOnItemSelectedListener(this);

        //size
        ArrayAdapter<CharSequence> scoop5 = ArrayAdapter.createFromResource(getContext(),R.array.icecream5, android.R.layout.simple_spinner_item);
        scoop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream5.setAdapter(scoop5);

        icecream5.setOnItemSelectedListener(this);

        //flavors
        ArrayAdapter<CharSequence> scoop6 = ArrayAdapter.createFromResource(getContext(),R.array.icecream6, android.R.layout.simple_spinner_item);
        scoop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream6.setAdapter(scoop6);

        icecream6.setOnItemSelectedListener(this);

        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String choice1 = adapterView.getItemAtPosition(i).toString();
        String choice2 = adapterView.getItemAtPosition(i).toString();
        String choice3 = adapterView.getItemAtPosition(i).toString();
        String choice4 = adapterView.getItemAtPosition(i).toString();
        String choice5 = adapterView.getItemAtPosition(i).toString();
        String choice6 = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getContext(), choice1, Toast.LENGTH_LONG).show();
        Toast.makeText(getContext(), choice2, Toast.LENGTH_LONG).show();
        Toast.makeText(getContext(), choice3, Toast.LENGTH_LONG).show();
        Toast.makeText(getContext(), choice4, Toast.LENGTH_LONG).show();
        Toast.makeText(getContext(), choice5, Toast.LENGTH_LONG).show();
        Toast.makeText(getContext(), choice6, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void setApplicationContext(Context applicationContext) {

    }
}

    

