package com.xpanxion.design.patterns.factory;

public class MercedesCar implements Car {

    @Override
    public void createCar() {
        System.out.println("Created Mercedes Car");
    }

}
