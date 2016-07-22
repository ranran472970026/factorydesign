package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Main {

    public static  void  main(String[] args){

        IVehicle bus;
        IFactory busFactory=new Factory("bus");
        bus=busFactory.produce();

        System.out.println(bus.VehicleName()+","+bus.Color()+","+bus.WheelCount());
    }
}
