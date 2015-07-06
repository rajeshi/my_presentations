package com.xpanxion.solid.principles;

public class Applicances {

    public static void main(String[] args) {
        MechanicalSwitchBoard msw = new MechanicalSwitchBoard();
        Laptop laptop = new Laptop(msw);
        Fan fan = new Fan(msw);
        Fridge fridge = new Fridge(msw);
        laptop.chargeBattery();
        fan.turnOn();
        fridge.savePower();
    }
}
