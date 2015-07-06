package com.xpanxion.solid.principles;

public class Fan {

    private final SwitchBoard sb;

    public Fan(SwitchBoard sb) {
        this.sb = sb;
    }

    public void turnOn() {
        this.sb.turnOn();
    }

    public void turnOff() {
        this.sb.turnOff();
    }
}
