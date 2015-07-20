package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.dto.car.LuxuryCar;

public abstract class Process {

    protected Process nextProcess;

    public void setNextProcess(Process nextProcess) {
        this.nextProcess = nextProcess;
    }

    public abstract void processCar(LuxuryCar car);
}
