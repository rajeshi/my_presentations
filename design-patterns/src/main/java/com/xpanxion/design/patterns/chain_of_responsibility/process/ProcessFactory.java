package com.xpanxion.design.patterns.chain_of_responsibility.process;

import com.xpanxion.design.patterns.dto.car.LuxuryCar;

public class ProcessFactory {

    public static void main(String[] args) {
        Process engineProcess = new EngineProcess();
        Process accelaratingProcess = new AccelartingSystemProcess();
        Process brakingProcess = new BrakingSystemProcess();
        Process clutchingProcess = new ClutchingSystemProcess();
        Process bodyDesignProcess = new BodyDesignProcess();
        engineProcess.setNextProcess(accelaratingProcess);
        accelaratingProcess.setNextProcess(brakingProcess);
        brakingProcess.setNextProcess(clutchingProcess);
        clutchingProcess.setNextProcess(bodyDesignProcess);

        LuxuryCar car = new LuxuryCar("Mercedes");
        engineProcess.processCar(car);

        System.out.print("The car is created with following attributes:\n"
                + "Engine:\n"
                + "Make: " + car.getEngine().getMake() + "\n"
                + "Name: " + car.getEngine().getName() + "\n"
                + "Version: " + car.getEngine().getVersion() + "\n"
                + "\n"
                + "Body Design:\n"
                + "Texture: " + car.getBody().isTexture() + "\n"
                + "Color: " + car.getBody().getColor() + "\n");

    }
}
