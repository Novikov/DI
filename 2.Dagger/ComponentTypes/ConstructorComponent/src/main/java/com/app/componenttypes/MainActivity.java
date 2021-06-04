package com.app.componenttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private AppComponent appComponent;

    @Inject
    A a;

    @Inject
    B b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Способ 1. Передаем модули с нужными параметрами. Потом используем их в provides методах.
        //Если забыть передать какой то модуль - Idea никак не подсветит ошибку. Получим RuntimeException.
        //Хоть message будет понятно говорить что мы забыли передать - говорят так лучше не делать.
        //Если и использовать такой способ, то только с конструктором в котором жестко прописаны параметры инициализации в теле конструктора.
        appComponent = DaggerAppComponent
                .builder()
                .appModule1(new AppModule1(1))
                .appModule2(new AppModule2(2))
                .build();

        appComponent.inject(this);

        Log.i(TAG, "onCreate: " + a.description + " " + b.description);

    }


    private static final String TAG = "MainActivity";
}