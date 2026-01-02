package com.javabridge.contracts;

public abstract class Automobile {

    protected Engine engine;

    public Automobile(Engine engine) {
        this.engine = engine;
    }

    public abstract void startup();
}
