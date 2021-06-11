package com.app.viewmodelinjection.di.utils;

import androidx.lifecycle.ViewModel;

import com.app.viewmodelinjection.MainViewModel;
import com.app.viewmodelinjection.di.utils.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    public abstract ViewModel bindAuthViewModel(MainViewModel viewModel);
}
