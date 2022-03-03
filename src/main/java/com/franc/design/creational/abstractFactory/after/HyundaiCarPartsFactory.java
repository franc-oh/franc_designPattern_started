package com.franc.design.creational.abstractFactory.after;

import com.franc.design.creational.abstractFactory.Engine;
import com.franc.design.creational.abstractFactory.Platform;

// 현대자동차 조립공장
public interface HyundaiCarPartsFactory {

    Engine createEngine();

    Platform createPlatform();

}
