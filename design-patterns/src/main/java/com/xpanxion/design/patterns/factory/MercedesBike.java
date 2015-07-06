package com.xpanxion.design.patterns.factory;

public class MercedesBike implements Bike{

    @Override
    public void createBike() {
        System.out.println("Created Mercedes Bike");
    }
    
}
