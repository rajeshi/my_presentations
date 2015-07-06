package com.xpanxion.solid.principles;

public class MechanicalSwitchBoard implements SwitchBoard{

    @Override
    public void turnOn() {
        System.out.println("Turn switch downwards");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn switch upwards");
    }
    
}
