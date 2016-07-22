package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Train implements  IVehicle {
    @Override
    public String VehicleName() {
        return "I am com.wonders.rdcenter.Train";
    }

    @Override
    public String WheelCount() {
        return "I have a great deal of wheels ";
    }

    @Override
    public String Color() {
        return "I am green";
    }
}
