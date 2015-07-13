package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.chain_of_responsibility.car.ClutchingSystem;
import com.xpanxion.design.patterns.chain_of_responsibility.car.LuxuryCar;

public class ClutchingSystemProcess extends Process {

    @Override
    public void processCar(LuxuryCar car) {
        car.setClutchingSystem(new ClutchingSystem());
        nextProcess.processCar(car);
    }

}
