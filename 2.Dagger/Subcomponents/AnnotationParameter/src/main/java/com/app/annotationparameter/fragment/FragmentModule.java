package com.app.annotationparameter.fragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    @Provides
    @Named("fragment string")
    String provideStringFromFragment(){
        return "fragment string";
    }
}
