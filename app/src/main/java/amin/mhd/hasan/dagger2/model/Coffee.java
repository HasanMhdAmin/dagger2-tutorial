package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    private Farm farm;
    private River river;

//    @Inject
    public Coffee(Farm farm, River river) {
        Log.d(TAG, "OCC Coffee: ");
        this.farm = farm;
        this.river = river;
    }

    public String getCoffeeCup() {
        String result = farm.getBeans() + ", " + river.getWater();
        Log.d(TAG, "OCC getCoffeeCup: " + result);
        return result;
    }
}
