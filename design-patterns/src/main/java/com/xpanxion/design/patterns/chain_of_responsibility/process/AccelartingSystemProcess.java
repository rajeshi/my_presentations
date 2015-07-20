package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.dto.car.AcceleratingSystem;
import com.xpanxion.design.patterns.dto.car.LuxuryCar;

public class AccelartingSystemProcess extends Process {

    @Override
    public void processCar(LuxuryCar car) {
        AcceleratingSystem as = new AcceleratingSystem();
        car.setAcceleratingSystem(as);
        nextProcess.processCar(car);
    }

}
