package com.xpanxion.design.patterns.chain_of_responsibility.car;

public class Steering {

    private boolean powerSteering;
    private int wheelRadius;

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
    
    
}
