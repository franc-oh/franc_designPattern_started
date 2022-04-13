package com.franc.design._01_creational._03_abstractFactory._02_after;

import com.franc.design._01_creational._03_abstractFactory.Engine;
import com.franc.design._01_creational._03_abstractFactory.Platform;

public class AvanteSportsPartsFactory implements HyundaiCarPartsFactory {
    @Override
    public Engine createEngine() {
        return new AvanteSportsEngine();
    }

    @Override
    public Platform createPlatform() {
        return new AvanteSportsPlatform();
    }
}
