package amin.mhd.hasan.dagger2;

import android.app.Application;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;

//TODO 2.1 Create Application class and init CoffeeComponent inside it
public class AppClass extends Application {

    private CoffeeComponent coffeeComponent;

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        coffeeComponent = DaggerCoffeeComponent.builder().sugar(2).milk(3).build();


    }
}
