package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;

    //TODO 1.0: let'S assume River is a class related to lib or SDK
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

    @Inject
    public String connectElectricity() {
        Log.d(TAG, "OCC connectElectricity: ");
        return "connecting ...";
    }
}
