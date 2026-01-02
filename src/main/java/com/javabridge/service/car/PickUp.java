package com.javabridge.service.car;

import com.javabridge.contracts.Automobile;
import com.javabridge.contracts.Engine;

public class PickUp extends Automobile {

    public PickUp(Engine engine) {
        super(engine);
    }

    @Override
    public void startup() {
        System.out.println("Pick up startup with " + engine.build());
    }
}
