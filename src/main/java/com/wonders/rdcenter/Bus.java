package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Bus implements IVehicle {
    @Override
    public String VehicleName() {
        return "I am com.wonders.rdcenter.Bus";
    }

    @Override
    public String WheelCount() {
        return "I have six wheels ";
    }

    @Override
    public String Color() {
        return "I am yellow";
    }
}
