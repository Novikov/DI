package com.app.customfactory;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

    @Component.Factory
    interface Factory{
        AppComponent create(@BindsInstance int firstInt, @BindsInstance Boolean firstString);
    }

}
