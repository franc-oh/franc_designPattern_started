package com.franc.design.creational.abstractFactory.after;

import com.franc.design.creational.abstractFactory.Avante;
import com.franc.design.creational.abstractFactory.AvanteEngine;
import com.franc.design.creational.abstractFactory.AvantePlatform;
import com.franc.design.creational.abstractFactory.HyundaiCar;

/**
 *   아반떼 공장 [After]
 */
public class AvanteCarFactory {

    HyundaiCarPartsFactory partsFactory;

    // 모든 종류의 아반떼에 대한 조립(엔진, 플랫폼)을 받는다.
    public AvanteCarFactory(HyundaiCarPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    public HyundaiCar createCar() {
        HyundaiCar car = new Avante();
        car.setEngine(partsFactory.createEngine()); // 모든 라인의 엔진을 장착할 수 있다.
        car.setPlatform(partsFactory.createPlatform()); // 모든 라인의 플랫폼을 장착할 수 있다.
        return car;
    }

}
