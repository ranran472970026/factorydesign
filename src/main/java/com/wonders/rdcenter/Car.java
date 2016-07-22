package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Car implements  IVehicle{
    @Override
    public String VehicleName() {
        return "I am com.wonders.rdcenter.Car";
    }

    @Override
    public String WheelCount() {
        return "I hava four wheels";
    }

    @Override
    public String Color() {
        return "I am blue";
    }
}
