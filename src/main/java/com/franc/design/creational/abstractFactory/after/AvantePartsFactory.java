package com.franc.design.creational.abstractFactory.after;

import com.franc.design.creational.abstractFactory.AvanteEngine;
import com.franc.design.creational.abstractFactory.AvantePlatform;
import com.franc.design.creational.abstractFactory.Engine;
import com.franc.design.creational.abstractFactory.Platform;

public class AvantePartsFactory implements HyundaiCarPartsFactory {
    @Override
    public Engine createEngine() {
        return new AvanteEngine();
    }

    @Override
    public Platform createPlatform() {
        return new AvantePlatform();
    }
}
