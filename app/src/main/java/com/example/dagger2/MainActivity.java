package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Dagger will inject the car object
    @Inject Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DaggerCarComponent -> implementation for the interface
        // press CTRL + B -> to see DaggerCarComponent which is created at compile time
        CarComponent component = DaggerCarComponent.create();

        component.inject(this);
        car.drive();
        //??
    }
}
