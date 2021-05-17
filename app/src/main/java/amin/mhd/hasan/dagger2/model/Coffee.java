package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
//    @Inject
    private Farm farm;
//    @Inject
    private River river;


    //TODO: 1. We will use field Injection (Why we need it? (e.g. in activity))

    @Inject
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


    //TODO: 2. method injection
//    @Inject
//    public String connectElectricity() {
//        Log.d(TAG, "OCC connectElectricity: ");
//        return "connecting ...";
//    }
}
