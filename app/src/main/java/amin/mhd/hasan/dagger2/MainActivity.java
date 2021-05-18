package amin.mhd.hasan.dagger2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;
import amin.mhd.hasan.dagger2.di.module.CoffeeModule;
import amin.mhd.hasan.dagger2.model.Coffee;
import amin.mhd.hasan.dagger2.model.River;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "OCC";

    @Inject
    Coffee coffee1;

    CoffeeComponent coffeeComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffeeComponent = DaggerCoffeeComponent
                .builder()
                .sugar(2)
                .milk(5)
                .build();

        coffeeComponent.inject(this);
        coffee1.getCoffeeCup();


    }
}