package com.franc.design._01_creational._03_abstractFactory;


public class HyundaiCar {

    private Engine engine;

    private Platform platform;


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
