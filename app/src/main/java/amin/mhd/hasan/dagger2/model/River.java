package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

//    @Inject
    public River() {
        Log.d(TAG, "OCC River: ");
    }

    public String getWater() {
        return "water";
    }
}
