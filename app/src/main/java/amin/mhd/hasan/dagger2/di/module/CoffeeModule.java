package amin.mhd.hasan.dagger2.di.module;

import amin.mhd.hasan.dagger2.model.River;
import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {


    // TODO: 2.1 make (int sugar) parameter and (constructor) and change (provideSugar)
//    int sugar;
//
//    public CoffeeModule(int sugar) {
//        this.sugar = sugar;
//    }

    @Provides
    River provideRiver() {
        return new River();
    }


    // TODO: 1.2 tell Dagger how to provide int
//    @Provides
//    int provideSugar() {
//        return sugar;
//    }
}
