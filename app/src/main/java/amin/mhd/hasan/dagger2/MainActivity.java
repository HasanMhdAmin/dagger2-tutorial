package amin.mhd.hasan.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;
import amin.mhd.hasan.dagger2.model.Coffee;
import amin.mhd.hasan.dagger2.model.Farm;
import amin.mhd.hasan.dagger2.model.River;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 1. manual DI
        Farm farm = new Farm();
        River river = new River();
        Coffee coffee = new Coffee(farm, river);
        coffee.getCoffeeCup();

        // TODO: 2. automated DI
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();
//        coffeeComponent.getCoffee().getCoffeeCup();

    }
}