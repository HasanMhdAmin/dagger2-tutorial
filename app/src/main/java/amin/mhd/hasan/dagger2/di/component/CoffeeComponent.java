package amin.mhd.hasan.dagger2.di.component;

import amin.mhd.hasan.dagger2.MainActivity;
import amin.mhd.hasan.dagger2.di.module.CoffeeModule;
import amin.mhd.hasan.dagger2.model.Coffee;
import dagger.Component;

//TODO: 1.3 Add module to component
@Component
//@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);
}
