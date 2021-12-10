package com.example.navdrawerversion.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawerversion.CheckOutFragment;
import com.example.navdrawerversion.MainActivity;
import com.example.navdrawerversion.R;


public class ChiliFragment extends Fragment {
    private SeekBar chiliSelector;
    private TextView output;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView=inflater.inflate(R.layout.fragment_chili,container,false);
        chiliSelector=rootView.findViewById(R.id.seekBar);
        output=rootView.findViewById(R.id.output);


        chiliSelector.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                    chiliSelected();
            }
        });
        return rootView;
    }
    private void chiliSelected(){
        int progress=chiliSelector.getProgress();
        if (progress==1){
            output.setText("You selected a 3-Way chili");
            CheckOutFragment.total+=1.00;
            CheckOutFragment.mainOrder.add("3-Way Chili ");
        }
        else if (progress==2){
            output.setText("You selected a 4-Way chili");
            CheckOutFragment.total+=1.50;
            CheckOutFragment.mainOrder.add("4-Way Chili ");
        }
        else if (progress==3){
            output.setText("You selected a 5-Way chili");
            CheckOutFragment.total+=2.00;
            CheckOutFragment.mainOrder.add("5-Way Chili ");
        }
        else if (progress==4){
            output.setText("You selected a 7-Way chili");
            CheckOutFragment.total+=2.50;
            CheckOutFragment.mainOrder.add("6-Way Chili ");
        }
        else{
            output.setText(" ");
        }
    }
}