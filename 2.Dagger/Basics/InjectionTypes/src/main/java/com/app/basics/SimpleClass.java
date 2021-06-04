package com.app.basics;

import javax.inject.Inject;

public class SimpleClass {
    private String providedString;

    @Inject
    public SimpleClass(String providedString) {
        this.providedString = providedString;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "providedString='" + providedString + '\'' +
                '}';
    }
}
