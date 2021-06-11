package com.app.subcomponents;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent (modules = {ActivityModule.class})
public interface ActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create();
    }

    void inject(MainActivity mainActivity);
}
