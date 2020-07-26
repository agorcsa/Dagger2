package com.example.dagger2.object;

import com.example.dagger2.wheelsobject.Rims;
import com.example.dagger2.wheelsobject.Tires;

public class Wheels {
    // we don't own this class, so we can not annotate it with @Inject
    // we assume that wheels class is in an external library

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

}
