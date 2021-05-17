package amin.mhd.hasan.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;
import amin.mhd.hasan.dagger2.di.module.CoffeeModule;
import amin.mhd.hasan.dagger2.model.Coffee;


public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent = DaggerCoffeeComponent
                .builder()
                .coffeeModule(new CoffeeModule(3))
                .build();


        // TODO: 1.1 better way to write builder
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent
//                .builder()
//                .sugar(2)
//                .milk(5)
//                .build();

        // TODO 2.4 run and test!! not working!

        coffeeComponent.inject(this);
        coffee.getCoffeeCup();

    }
}