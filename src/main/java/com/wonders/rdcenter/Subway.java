package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Subway implements  IVehicle {
    @Override
    public String VehicleName() {
        return "I am com.wonders.rdcenter.Subway";
    }

    @Override
    public String WheelCount() {
        return "I have no wheel ";
    }

    @Override
    public String Color() {
        return "I am green";
    }
}
