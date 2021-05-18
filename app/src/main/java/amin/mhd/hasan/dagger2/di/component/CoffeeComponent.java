package amin.mhd.hasan.dagger2.di.component;

import javax.inject.Singleton;

import amin.mhd.hasan.dagger2.MainActivity;
import amin.mhd.hasan.dagger2.di.module.CoffeeModule;
import amin.mhd.hasan.dagger2.di.qualifier.Milk;
import amin.mhd.hasan.dagger2.di.qualifier.Sugar;
import amin.mhd.hasan.dagger2.model.Coffee;
import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder sugar(@Sugar int sugar);

        CoffeeComponent build();

        @BindsInstance
        Builder milk(@Milk int milk);

    }

}
