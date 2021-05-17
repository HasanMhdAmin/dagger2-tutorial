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

        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();
        // TODO: 2.2 make int sugar parameter and constructor
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent
//                .builder()
//                .coffeeModule(new CoffeeModule(3))
//                .build();

        coffeeComponent.inject(this);
        coffee.getCoffeeCup();

    }
}