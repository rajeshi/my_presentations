package com.xpanxion.solid.principles;

public class Fridge {

    private final SwitchBoard sb;

    public Fridge(SwitchBoard sb) {
        this.sb = sb;
    }

    public void startCooling() {
        this.sb.turnOn();
    }

    public void savePower() {
        this.sb.turnOff();
    }
}
