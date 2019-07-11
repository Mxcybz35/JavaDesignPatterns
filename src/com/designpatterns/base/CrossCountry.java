package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class CrossCountry extends MountainBike{

    protected CrossCountry(WheelInterface wheel, BikeColor color){

        super(wheel, color);



    }

    protected CrossCountry(WheelInterface wheel){

        this(wheel, BikeColor.ORANGE);


    }

    @Override
    public float getPrice() {
        return 850.00f;
    }
}
