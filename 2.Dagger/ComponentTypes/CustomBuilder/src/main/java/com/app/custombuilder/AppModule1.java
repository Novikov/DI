package com.app.custombuilder;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule1 {

    //Нельзя использовать такую конструкцию. Вылетит error: [Dagger/DependencyCycle] Found a dependency cycle:
    //Т.е мы возращаем тоже самое что и передали в граф. Для того, чтобы заработало нужно вернуть другой класс,
    //который может использовать данное значение
//    @Provides
//    int provideInt(int firstInt){
//        return firstInt;
//    }

    //Например вот так:
//    @Provides
//    String provideInt(int firstInt){
//        return String.valueOf(firstInt);
//    }

    @Provides
    static String provideInt(int firstInt){
        return String.valueOf(firstInt);
    }

}
