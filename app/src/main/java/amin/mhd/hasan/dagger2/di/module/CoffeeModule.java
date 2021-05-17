package amin.mhd.hasan.dagger2.di.module;

import amin.mhd.hasan.dagger2.model.River;
import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    //TODO 1.2: we tell Dagger how to create a new instance from River

    @Provides
    River provideRiver() {
        return new River();
    }
}
