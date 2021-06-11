package com.app.annotationparameter.fragment;

import dagger.Subcomponent;

@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
    @Subcomponent.Factory
    interface Factory {
        FragmentComponent create();
    }

    void inject(MainFragment mainFragment);
}
