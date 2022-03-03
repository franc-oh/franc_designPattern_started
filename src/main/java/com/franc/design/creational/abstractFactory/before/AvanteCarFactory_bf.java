package com.franc.design.creational.abstractFactory.before;

import com.franc.design.creational.abstractFactory.Avante;
import com.franc.design.creational.abstractFactory.AvanteEngine;
import com.franc.design.creational.abstractFactory.AvantePlatform;
import com.franc.design.creational.abstractFactory.HyundaiCar;

/**
 *   아반떼를 만드는 아반떼 공장 [Before]
 */
public class AvanteCarFactory_bf {

    public HyundaiCar createCar() {
        HyundaiCar car = new Avante();
        car.setEngine(new AvanteEngine()); // 아반떼 스포츠 엔진이 추가된다면???
        car.setPlatform(new AvantePlatform()); // 아반떼 스포츠 플랫폼이 추가된다면??
        return car;
    }

}
