package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DaggerCarComponent -> implementation for the interface
        // press CTRL + B -> to see DaggerCarComponent which is created at compile time
        CarComponent component = DaggerCarComponent.create();

        // Accesses getCar() from the CarComponent interface
        car = component.getCar();
        car.drive();
    }
}
