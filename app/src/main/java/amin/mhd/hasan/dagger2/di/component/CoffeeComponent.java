package amin.mhd.hasan.dagger2.di.component;

import amin.mhd.hasan.dagger2.MainActivity;
import amin.mhd.hasan.dagger2.model.Coffee;
import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();


    // TODO: 1.2 field injection.
    void inject(MainActivity mainActivity);
}
