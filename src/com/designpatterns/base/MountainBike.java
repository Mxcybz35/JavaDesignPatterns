package com.designpatterns.base;

import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.java.BikeColor;

public abstract class MountainBike extends AbstractBike {

    public  MountainBike(WheelInterface wheel, BikeColor color){

        super(wheel, color);
    }

   public MountainBike(WheelInterface wheel){

        super(wheel, BikeColor.ORANGE);
    }

    @Override
    public float getPrice() {
        return 780.00f;
    }
}
