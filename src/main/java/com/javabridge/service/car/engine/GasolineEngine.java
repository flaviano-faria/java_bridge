package com.javabridge.service.car.engine;

import com.javabridge.contracts.Engine;

public class GasolineEngine implements Engine {
    @Override
    public String build() {
        return "Gasoline Engine";
    }
}
