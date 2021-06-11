package com.app.annotationparameter.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.annotationparameter.app.App;
import com.app.annotationparameter.fragment.FragmentComponent;
import com.app.annotationparameter.fragment.MainFragment;
import com.app.annotationparameter.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public FragmentComponent.Factory fragmentComponentFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).activityComponentFactory.create().inject(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, MainFragment.class, null)
                    .commit();
        }
    }
}