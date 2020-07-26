package com.example.dagger2.component;

import com.example.dagger2.Car;
import com.example.dagger2.MainActivity;
import com.example.dagger2.module.WheelsModule;

import dagger.Component;

// we add WheelsModule to our Car component
@Component (modules = WheelsModule.class)
public interface CarComponent {

    // getCar() provisional method
    // returns an object of type Car
    Car getCar();

    // no method body, because it's just an interface
    void inject(MainActivity mainActivity);
}
