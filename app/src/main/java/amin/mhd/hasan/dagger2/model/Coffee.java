package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;
    @Inject
    River river;

    @Inject
    public Coffee() {
        Log.d(TAG, "OCC Coffee: ");
    }

    public String getCoffeeCup() {
        String result = farm.getBeans() + ", " + river.getWater();
        Log.d(TAG, "OCC getCoffeeCup: " + result);
        return result;
    }

    public String connectElectricity() {
        Log.d(TAG, "OCC connectElectricity: ");
        return "connecting ...";
    }
}
