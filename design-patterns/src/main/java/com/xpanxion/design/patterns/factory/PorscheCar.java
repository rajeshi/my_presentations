package com.xpanxion.design.patterns.factory;

public class PorscheCar implements Car {

    @Override
    public void createCar() {
        System.out.println("Created Porsche Car");
    }

}
