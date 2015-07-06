package com.xpanxion.design.patterns.factory;

public class FerrariCar implements Car {

    @Override
    public void createCar() {
        System.out.println("Created Ferrari Car");
    }

}
