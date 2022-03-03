package com.franc.design.creational.abstractFactory.after;

import com.franc.design.creational.abstractFactory.Engine;
import com.franc.design.creational.abstractFactory.Platform;

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
