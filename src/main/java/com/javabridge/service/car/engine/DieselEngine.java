package com.javabridge.service.car.engine;

import com.javabridge.contracts.Engine;

public class DieselEngine implements Engine {
    @Override
    public String build() {
        return "Diesel Engine";
    }
}
