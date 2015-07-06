package com.xpanxion.design.patterns.factory;

public class PorscheBike implements Bike {

    @Override
    public void createBike() {
        System.out.println("Created Porsche Bike");
    }

}
