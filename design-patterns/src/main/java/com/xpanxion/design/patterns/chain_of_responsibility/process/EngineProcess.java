package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.chain_of_responsibility.car.Engine;
import com.xpanxion.design.patterns.chain_of_responsibility.car.LuxuryCar;

public class EngineProcess extends Process {

    @Override
    public void processCar(LuxuryCar car) {
        Engine engine = new Engine();
        engine.setMake("Mercedes");
        engine.setName("ENGX17891AMG");
        engine.setVersion("4.7.2.1");
        car.setEngine(engine);
        nextProcess.processCar(car);
    }

}
