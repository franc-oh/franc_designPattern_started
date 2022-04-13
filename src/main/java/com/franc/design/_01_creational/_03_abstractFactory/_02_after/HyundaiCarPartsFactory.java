package com.franc.design._01_creational._03_abstractFactory._02_after;

import com.franc.design._01_creational._03_abstractFactory.Engine;
import com.franc.design._01_creational._03_abstractFactory.Platform;

// 현대자동차 조립공장
public interface HyundaiCarPartsFactory {

    Engine createEngine();

    Platform createPlatform();

}
