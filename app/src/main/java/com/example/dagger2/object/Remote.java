package com.example.dagger2.object;

import android.util.Log;

import com.example.dagger2.Car;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Remote {

    // used by Dagger to create instances of this class
    // Dagger creates remote objects
    @Inject
    public Remote() {}

    // method doesn't need to be private, otherwise Dagger can not call it
    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
