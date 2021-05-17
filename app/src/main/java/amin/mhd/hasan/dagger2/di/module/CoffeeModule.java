package amin.mhd.hasan.dagger2.di.module;

import amin.mhd.hasan.dagger2.model.River;
import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    
    @Provides
    River provideRiver() {
        return new River();
    }
}
