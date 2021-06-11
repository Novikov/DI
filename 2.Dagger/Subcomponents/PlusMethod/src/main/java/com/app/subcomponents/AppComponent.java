package com.app.subcomponents;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    @Component.Factory
    interface Factory {
        AppComponent create();
    }

    ActivityComponent.Factory plusActivityComponent();
}
