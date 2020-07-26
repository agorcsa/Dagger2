package com.example.dagger2.module;

import com.example.dagger2.object.Wheels;
import com.example.dagger2.wheelsobject.Rims;
import com.example.dagger2.wheelsobject.Tires;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

   // method which returns objects of type Rims
    // static is used when we don't have to create an instance
    @Provides
  static Rims provideRims() {
       return new Rims();
   }


   @Provides
   static Tires provideTires() {
        Tires tires = new Tires();
        // method used for doing whatever configuration we want on the object "tires"
        tires.inflate();
        return tires;
   }

   // Dagger gets "rims" and "tires"
    // In real apps instead of calling the constructor, we can call a builder method like Retrofit Builder
   @Provides
   static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
   }
}
