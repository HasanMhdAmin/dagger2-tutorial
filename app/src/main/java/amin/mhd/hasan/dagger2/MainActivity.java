package amin.mhd.hasan.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;
import amin.mhd.hasan.dagger2.model.Coffee;


public class MainActivity extends AppCompatActivity {

    // TODO: 1.1 field injection.
//    @Inject
//    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 0.0
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();
        coffeeComponent.getCoffee().getCoffeeCup();


        // TODO: 1.3 field injection.
//        coffeeComponent.inject(this);
//        coffee.getCoffeeCup();

    }
}