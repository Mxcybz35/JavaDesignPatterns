package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Vintage extends RoadBike{

    protected Vintage(WheelInterface wheel, BikeColor color){

        super(wheel, color);


    }
    protected Vintage(WheelInterface wheel){

        this(wheel, BikeColor.RED);

    }

}
