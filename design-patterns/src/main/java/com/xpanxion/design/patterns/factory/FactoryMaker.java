package com.xpanxion.design.patterns.factory;

public class FactoryMaker {

    private static VehicleFactory vf = null;

    static VehicleFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("MERCEDES")) {
            vf = new MercedesVehicleFactory();
        } else if (brand.equalsIgnoreCase("PORSCHE")) {
            vf = new PorscheVehicleFactory();
        }
        return vf;
    }
}
