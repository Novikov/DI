package com.app.annotationparameter.activity;

import com.app.annotationparameter.fragment.FragmentComponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = FragmentComponent.class)
public class ActivityModule {
    @Provides
    @Named("activity string")
    String provideStringFromFragment(){
        return "activity string";
    }
}
