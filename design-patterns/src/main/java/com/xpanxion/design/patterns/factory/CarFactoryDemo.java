package com.xpanxion.design.patterns.factory;

public class CarFactoryDemo {

    public static void main(String args[]) {
        VehicleFactory factory = FactoryMaker.getFactory("Mercedes");
        Car car = factory.createCar();
        car.createCar();
        Bike bike = factory.createBike();
        bike.createBike();
    }
}
