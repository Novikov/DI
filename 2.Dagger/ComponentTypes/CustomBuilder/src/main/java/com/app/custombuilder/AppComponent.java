package com.app.custombuilder;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule1.class,AppModule2.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder firstInt(int firstInt);

        AppComponent build();
    }
}
