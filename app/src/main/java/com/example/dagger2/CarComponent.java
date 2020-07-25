package com.example.dagger2;

import dagger.Component;

@Component
public interface CarComponent {

    // getCar() provisional method
    // returns an object of type Car
    Car getCar();

    // no method body, because it's just an interface
    void inject(MainActivity mainActivity);
}
