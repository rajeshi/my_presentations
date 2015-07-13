package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.chain_of_responsibility.car.Body;
import com.xpanxion.design.patterns.chain_of_responsibility.car.LuxuryCar;

public class BodyDesignProcess extends Process {

    @Override
    public void processCar(LuxuryCar car) {
        Body body = new Body();
        body.setTexture(true);
        body.setColor("Red");
        car.setBody(body);
    }
}
