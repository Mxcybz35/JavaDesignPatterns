package com.designpatterns.abstractfactory;

public class MountainSeat implements BikeSeatInterface {
    @Override
    public String getSeatPArt() {
        return "Seat parts for the Mountain Bike.";
    }
}
