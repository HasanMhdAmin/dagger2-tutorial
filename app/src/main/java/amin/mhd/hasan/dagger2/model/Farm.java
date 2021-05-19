package amin.mhd.hasan.dagger2.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

// TODO 1.1 add @Singleton
//@Singleton
public class Farm {
    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.d(TAG, "OCC Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }
}
