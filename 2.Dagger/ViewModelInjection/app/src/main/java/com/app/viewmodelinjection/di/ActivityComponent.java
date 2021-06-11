package com.app.viewmodelinjection.di;

import com.app.viewmodelinjection.MainActivity;
import com.app.viewmodelinjection.di.utils.MainViewModelModule;

import dagger.Component;

@Component(modules = {ActivityModule.class,ViewModuleFactoryModule.class, MainViewModelModule.class})
public interface ActivityComponent {
    @Component.Factory
    interface Factory {
        ActivityComponent create();
    }

    void inject(MainActivity mainActivity);
}
