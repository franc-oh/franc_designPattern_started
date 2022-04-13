package com.franc.design._01_creational._03_abstractFactory._02_after;

import com.franc.design._01_creational._03_abstractFactory.AvanteEngine;
import com.franc.design._01_creational._03_abstractFactory.AvantePlatform;
import com.franc.design._01_creational._03_abstractFactory.Engine;
import com.franc.design._01_creational._03_abstractFactory.Platform;

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
