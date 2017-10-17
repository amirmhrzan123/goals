package com.example.amir.goalapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amir.goalapp.R;
import com.example.amir.goalapp.helpers.Contracts;

/**
 * Created by Amir on 04/10/2017.
 */

public class FragmentToday extends Fragment {
    private int pos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.scores_fragment, null);
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        pos = getArguments().getInt(Contracts.Extras.EXTRADATA);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static FragmentToday getInstance(int position){
        FragmentToday fragmentToday = new FragmentToday();
        Bundle bundle = new Bundle();
        bundle.putInt(Contracts.Extras.EXTRADATA,position);
        fragmentToday.setArguments(bundle);
        return fragmentToday;
    }
}
