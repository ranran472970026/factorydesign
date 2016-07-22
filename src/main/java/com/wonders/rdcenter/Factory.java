package com.wonders.rdcenter;

/**
 * Created by dylan_Apple on 16/7/22.
 */
public class Factory implements IFactory {

    private String type;

    public Factory(String type){
        this.type=type;
    }
    @Override
    public IVehicle produce() {

        IVehicle vehicle = null;
        switch (type) {
            case "bus":
                vehicle = new Bus();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            case "subway":
                vehicle = new Subway();
                break;
        }
        return vehicle;
    }
}
