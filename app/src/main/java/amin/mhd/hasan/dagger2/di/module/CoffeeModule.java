package amin.mhd.hasan.dagger2.di.module;

import amin.mhd.hasan.dagger2.model.River;
import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    // TODO 1.2 remove sugar with provider and constructor

    int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    River provideRiver() {
        return new River();
    }


    @Provides
    int provideSugar() {
        return sugar;
    }

}
