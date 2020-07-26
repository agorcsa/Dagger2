package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject Engine engine;
    private Wheels wheels;

    // constructor injection
    // car will be automatically instantiated
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    // method injection
    // remote controller for the car (locks/ unlocks the car
    // this = car instance
    // used only when you need to pass the object(car) itself to the dependency(remote object)
    // can not be passed in the constructor, as the "car" object is not fully instantiated there
    // the method will be run only after the constructor finishes
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
