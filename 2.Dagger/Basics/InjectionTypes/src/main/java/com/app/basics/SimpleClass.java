package com.app.basics;

import android.util.Log;

import javax.inject.Inject;

public class SimpleClass {
    private String providedString;

    @Inject
    public SimpleClass(String providedString) {
        this.providedString = providedString;
    }


    //Dagger сам вызовет данный метод
    @Inject
    public void method(Integer provideInt) {
        Log.i(TAG, "method injection " + provideInt);
     }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "providedString='" + providedString + '\'' +
                '}';
    }

    private static final String TAG = "SimpleClass";
}
