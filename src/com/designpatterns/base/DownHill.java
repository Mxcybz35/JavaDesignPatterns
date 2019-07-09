package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class DownHill extends MountainBike {

    protected DownHill(WheelInterface wheel, BikeColor color){

        super(wheel, color);



    }

    protected DownHill(WheelInterface wheel){

        this(wheel, BikeColor.GREEN);


    }


}
