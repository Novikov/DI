package com.app.daggerapplicationappactivityfragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.app.daggerapplicationappactivityfragment.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class BlankFragment extends DaggerFragment {
    @Inject
    int number;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "number from fragment module - "+number);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    private static final String TAG = "BlankFragment";
}