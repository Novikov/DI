package com.app.basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private AppComponent component;

    @Inject
    String providedString;

    @Inject
    SimpleClass simpleClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        component = DaggerAppComponent.builder().build();
        component.inject(this);

        Log.i(TAG, "property injection in Activity: " + providedString);

        Log.i(TAG, "constructor injection in Activity: " + simpleClass.toString());
    }

    //При иньекции в метод - Dagger сам вызовет данный метод.
    //Говорят это может пригодиться при инициализации параметров класс после создания его экземпляра.
    //Dagger доолжен понимать где взять каждый параметр метода. Если добавим один неизвестный, то он не сбилдится.

    @Inject
    public void testMethod(String providedString){
        Log.i(TAG, "property injection in Activity method:" + providedString);
    }

    private static final String TAG = "MainActivity";
}