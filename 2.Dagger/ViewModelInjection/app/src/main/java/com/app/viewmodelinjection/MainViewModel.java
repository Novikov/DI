package com.app.viewmodelinjection;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {
    Integer i;

    @Inject
    public MainViewModel(Integer i) {
        this.i = i;
    }

    void printInfo(){
        System.out.println("Injected integer is" + i);
    }
}
