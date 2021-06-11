package com.app.viewmodelinjection.di;

import androidx.lifecycle.ViewModelProvider;

import com.app.viewmodelinjection.di.utils.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModuleFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
