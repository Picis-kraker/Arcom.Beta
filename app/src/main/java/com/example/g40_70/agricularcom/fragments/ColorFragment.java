package com.example.g40_70.agricularcom.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.g40_70.agricularcom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {


    public ColorFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

}
