package com.app.annotationparameter.activity;

import dagger.Subcomponent;

@Subcomponent
public interface ActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create();
    }

    void inject(MainActivity mainActivity);
}
