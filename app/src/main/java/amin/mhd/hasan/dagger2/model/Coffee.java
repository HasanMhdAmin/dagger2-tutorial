package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;

    @Inject
    River river;

    int sugar;

    @Inject
    public Coffee(int sugar) {
        Log.d(TAG, "OCC Coffee: ");
        this.sugar = sugar;
    }

    public String getCoffeeCup() {
        String result = farm.getBeans() + ", " + river.getWater() + ", sugar: " + sugar;
        Log.d(TAG, "OCC getCoffeeCup: " + result);
        return result;
    }

    @Inject
    public String connectElectricity() {
        Log.d(TAG, "OCC connectElectricity: ");
        return "connecting ...";
    }
}
