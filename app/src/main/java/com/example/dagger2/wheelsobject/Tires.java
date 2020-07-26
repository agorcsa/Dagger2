package com.example.dagger2.wheelsobject;

import android.util.Log;

public class Tires {
    // we can't annotate this class either with @Inject

    private static final String TAG = "Tires";

    // empty constructor
    public Tires() {}

    public void inflate() {
        Log.d(TAG, "inflates tires");
    }
}
