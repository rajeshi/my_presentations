package com.xpanxion.design.patterns.factory;

public class PorscheVehicleFactory extends VehicleFactory {

    @Override
    public Car createCar() {
        return new PorscheCar();
    }

    @Override
    public Bike createBike() {
        return new PorscheBike();
    }

}
