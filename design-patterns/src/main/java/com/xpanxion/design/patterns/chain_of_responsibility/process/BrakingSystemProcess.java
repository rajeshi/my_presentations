package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.dto.car.BrakingSystem;
import com.xpanxion.design.patterns.dto.car.LuxuryCar;

public class BrakingSystemProcess extends Process {
    
    @Override
    public void processCar(LuxuryCar car) {
        BrakingSystem bs = new BrakingSystem();
        car.setBrakingSystem(bs);
        nextProcess.processCar(car);
    }
    
}
