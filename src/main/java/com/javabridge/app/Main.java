package com.javabridge.app;

import com.javabridge.contracts.Automobile;
import com.javabridge.service.car.PickUp;
import com.javabridge.service.car.SportCar;
import com.javabridge.service.car.engine.DieselEngine;
import com.javabridge.service.car.engine.GasolineEngine;

public class Main {
    public static void main(String[] args) {


        Automobile ferrari = new SportCar(new GasolineEngine());
        Automobile fordTruck = new PickUp(new DieselEngine());

        ferrari.startup();
        fordTruck.startup();
    }
}