package com.javabridge.service.car;

import com.javabridge.contracts.Automobile;
import com.javabridge.contracts.Engine;

public class SportCar extends Automobile {

    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void startup() {
        System.out.println("Sport car startup with " + engine.build());
    }
}
