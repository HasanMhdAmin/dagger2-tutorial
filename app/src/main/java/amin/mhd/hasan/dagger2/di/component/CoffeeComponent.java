package amin.mhd.hasan.dagger2.di.component;

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

    // TODO 1.3 create a builder

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder sugar(
//                @Sugar
//                        int sugar);
//
//        CoffeeComponent build();
//
//
//        // TODO 2.3 add milk builder
//        @BindsInstance
//        Builder milk(
//                @Milk
//                        int milk);
//
//
//        // TODO 2.8 Update Qualifier
//
//    }

}
