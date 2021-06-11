package com.app.annotationparameter.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.annotationparameter.R;
import com.app.annotationparameter.activity.MainActivity;

import javax.inject.Inject;
import javax.inject.Named;

public class MainFragment extends Fragment {
    @Inject
    @Named("app string")
    String appString;

    @Inject
    @Named("activity string")
    String activityString;

    @Inject
    @Named("fragment string")
    String fragmentString;


    public MainFragment() {}

    @Override
    public void onAttach(@NonNull Context context) {
        ((MainActivity)requireActivity()).fragmentComponentFactory.create().inject(this);
        super.onAttach(context);
    }

    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, appString + ", " + activityString + ", " +fragmentString);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }

    private static final String TAG = "MainFragment";
}