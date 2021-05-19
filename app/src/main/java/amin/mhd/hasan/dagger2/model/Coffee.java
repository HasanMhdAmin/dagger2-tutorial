package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import amin.mhd.hasan.dagger2.di.qualifier.Milk;
import amin.mhd.hasan.dagger2.di.qualifier.Sugar;

// TODO 1.3 let's make coffee also singleton (optional)
//@Singleton
public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    public Farm farm;

    @Inject
    River river;

    int sugar;
    int milk;

    @Inject
    public Coffee(@Sugar int sugar, @Milk int milk) {
        Log.d(TAG, "OCC Coffee: ");
        this.sugar = sugar;
        this.milk = milk;
    }

    public String getCoffeeCup() {
        String result = farm.getBeans() + ", " + river.getWater() + ", sugar: " + sugar + ", milk: " + milk;
        Log.d(TAG, "OCC getCoffeeCup: " + result);
        return result;
    }

    @Inject
    public String connectElectricity() {
        Log.d(TAG, "OCC connectElectricity: ");
        return "connecting ...";
    }
}
