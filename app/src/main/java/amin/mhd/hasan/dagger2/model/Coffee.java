package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

import amin.mhd.hasan.dagger2.di.qualifier.Milk;
import amin.mhd.hasan.dagger2.di.qualifier.Sugar;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;

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
