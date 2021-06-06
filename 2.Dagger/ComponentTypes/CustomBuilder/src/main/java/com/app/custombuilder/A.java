package com.app.custombuilder;

import javax.inject.Inject;

public class A implements Simple {
    int number;

    @Inject
    public A(int firstInt) {
    this.number = firstInt;
    }

    @Override
    public String getInfo() {
        return String.valueOf(number);
    }
}
