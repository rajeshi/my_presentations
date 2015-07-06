package com.xpanxion.solid.principles;

public class Laptop {

    private SwitchBoard sb;

    public Laptop(SwitchBoard sb) {
        this.sb = sb;
    }

    public void chargeBattery() {
        this.sb.turnOn();
    }

    public void useBattery() {
        this.sb.turnOff();
    }
}
