package amin.mhd.hasan.dagger2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import amin.mhd.hasan.dagger2.di.component.CoffeeComponent;
import amin.mhd.hasan.dagger2.di.component.DaggerCoffeeComponent;
import amin.mhd.hasan.dagger2.model.Coffee;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee1;

    @Inject
    Coffee coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2.1 remove this, and use coffeeComponent from AppClass
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent
                .builder()
                .sugar(2)
                .milk(5)
                .build();

//        CoffeeComponent coffeeComponent = ((AppClass)getApplication()).getCoffeeComponent();

        coffeeComponent.inject(this);
        coffee1.getCoffeeCup();

        Log.d(TAG, "onCreate:OCC coffee1: farm " + coffee1);
        Log.d(TAG, "onCreate:OCC coffee1: farm " + coffee2);

        Log.d(TAG, "onCreate:OCC coffee1: farm " + coffee1.farm);
        Log.d(TAG, "onCreate:OCC coffee2: farm " + coffee2.farm);

        // TODO 1.4 Note: every thing is working fine, coffee1 and coffee2 has the same address
        //  but when we rotate the screen, the address changed from the first one
        //  (but still the same address)

    }
}