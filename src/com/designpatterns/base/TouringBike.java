package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class TouringBike extends RoadBike{

    public TouringBike(WheelInterface wheel, BikeColor color) {

        super(wheel, color);
    }

    public TouringBike(WheelInterface wheel){

       this(wheel,BikeColor.BLUE);

    }



}
