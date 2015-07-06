package com.xpanxion.design.patterns.factory;

public class MercedesVehicleFactory extends VehicleFactory {

    @Override
    public Car createCar() {
        return new MercedesCar();
    }

    @Override
    public Bike createBike() {
        return new MercedesBike();
    }

}
